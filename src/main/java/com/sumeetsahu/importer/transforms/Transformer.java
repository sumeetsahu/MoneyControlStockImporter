package com.sumeetsahu.importer.transforms;

import com.sumeetsahu.importer.model.ContractNote;
import com.sumeetsahu.moneycontrol.model.Exchange;
import com.sumeetsahu.moneycontrol.model.MoneyControlEntry;
import com.sumeetsahu.moneycontrol.model.TransactionType;
import com.sumeetsahu.zerodha.model.ZerodhaContractNote.Contracts.Contract.Trades.Trade;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.val;

public class Transformer {

  public static List<MoneyControlEntry> processTrades(List<ContractNote> contractNotes) {
    List<MoneyControlEntry> entries =
        new ArrayList<>(
            Math.toIntExact(
                contractNotes.stream()
                    .flatMap(
                        (Function<ContractNote, Stream<?>>)
                            contractNote -> contractNote.getTrades().stream())
                    .count()));
    for (ContractNote contractNote : contractNotes) {
      for (Trade trade : contractNote.getTrades()) {
        String[] instrumentId = trade.getInstrumentId().split(":");
        String stockName = instrumentId.length > 1 ? instrumentId[1] : instrumentId[0];
        val entry =
            MoneyControlEntry.builder()
                .isinCode("")
                .stockName(stockName)
                .date(trade.getTimestamp().toGregorianCalendar().toZonedDateTime().toLocalDate())
                .transactionType(
                    "buy".equalsIgnoreCase(trade.getType())
                        ? TransactionType.BUY
                        : TransactionType.SELL)
                .exchange("bse".equalsIgnoreCase(trade.getExchange()) ? Exchange.BSE : Exchange.NSE)
                .quantity(Math.abs(trade.getQuantity()))
                .pricePerShare(trade.getAveragePrice())
                .contractNoteId(contractNote.getContractPayLoad().getId())
                .transactionId(String.valueOf(trade.getId()))
                .orderId(trade.getOrderId().toString())
                .note("Broker:" + contractNote.getContractPayLoad().getIssuer().getName() + ";")
                .contractNotePayLoad(contractNote)
                .build();
        entries.add(entry);
      }
    }
    return entries;
  }

  public static List<MoneyControlEntry> processAdditionalCharge(List<MoneyControlEntry> entries) {
    List<MoneyControlEntry> result = new ArrayList<>(entries.size());
    for (MoneyControlEntry entry : entries) {
      BigDecimal extraCharge =
          entry
              .getContractNotePayLoad()
              .getNetPayable()
              .subtract(entry.getContractNotePayLoad().getObligation());
      if (extraCharge.doubleValue() < 0) {
        throw new RuntimeException("Extra charge cannot be less than zero");
      }

      BigDecimal extraChargePerTrade =
          extraCharge.divide(
              BigDecimal.valueOf(entry.getContractNotePayLoad().getTrades().size()),
              2,
              RoundingMode.HALF_UP);

      BigDecimal otherCharges = entry.getOtherCharges();
      result.add(
          entry.toBuilder()
              .otherCharges(
                  otherCharges == null
                      ? extraChargePerTrade
                      : otherCharges.add(extraChargePerTrade))
              .build());
    }
    return result;
  }

  public static List<MoneyControlEntry> processTotalAmount(List<MoneyControlEntry> entries) {
    List<MoneyControlEntry> result = new ArrayList<>(entries.size());
    for (MoneyControlEntry entry : entries) {
      BigDecimal totalAmount =
          entry.getPricePerShare().multiply(BigDecimal.valueOf(entry.getQuantity()));
      BigDecimal totalCharges =
          getBigDecimal(entry.getBrokerage())
              .add(getBigDecimal(entry.getOtherCharges()))
              .add(getBigDecimal(entry.getServiceTax()))
              .add(getBigDecimal(entry.getStt()))
              .add(getBigDecimal(entry.getExchangeCharge()))
              .add(getBigDecimal(entry.getStampDuty()))
              .add(getBigDecimal(entry.getSebiCharges()));

      BigDecimal netAmount =
          entry.getTransactionType() == TransactionType.BUY
              ? totalAmount.add(totalCharges)
              : totalAmount.subtract(totalCharges);
      result.add(
          entry.toBuilder()
              .totalAmount(totalAmount)
              .totalCharges(totalCharges)
              .netAmount(netAmount)
              .build());
    }
    return result;
  }

  private static BigDecimal getBigDecimal(BigDecimal otherCharges) {
    return otherCharges == null ? new BigDecimal(0) : otherCharges;
  }

  public static List<MoneyControlEntry> trueUp(
      List<ContractNote> contractNotes, List<MoneyControlEntry> entries) {
    Map<String, BigDecimal> contractNoteInput = new HashMap<>();
    for (ContractNote contractNote : contractNotes) {
      contractNoteInput.put(
          contractNote.getContractPayLoad().getId(), contractNote.getNetPayable());
    }

    Map<String, BigDecimal> moneyControlOutput = new HashMap<>();
    for (MoneyControlEntry entry : entries) {
      BigDecimal netAmount =
          entry.getTransactionType() == TransactionType.SELL
              ? entry.getNetAmount().negate()
              : entry.getNetAmount();
      if (moneyControlOutput.containsKey(entry.getContractNoteId())) {
        moneyControlOutput.put(
            entry.getContractNoteId(),
            moneyControlOutput.get(entry.getContractNoteId()).add(netAmount));
      } else {
        moneyControlOutput.put(entry.getContractNoteId(), netAmount);
      }
    }

    Map<String, BigDecimal> errorMap = new HashMap<>();

    for (val output : moneyControlOutput.entrySet()) {
      if (!contractNoteInput.containsKey(output.getKey())) {
        throw new RuntimeException("Not output for contract note id:" + output.getKey());
      }

      BigDecimal error = contractNoteInput.get(output.getKey()).subtract(output.getValue());

      if (error.compareTo(new BigDecimal(0)) != 0) {
        errorMap.put(output.getKey(), error);
      }
      if (error.abs().compareTo(new BigDecimal(1)) > 0) {
        throw new RuntimeException("True up Failed");
      }
    }

    return entries.stream()
        .map(
            moneyControlEntry ->
                errorMap.containsKey(moneyControlEntry.getContractNoteId())
                    ? moneyControlEntry.toBuilder()
                        .note(
                            moneyControlEntry.getNote()
                                + "error: "
                                + errorMap.get(moneyControlEntry.getContractNoteId())
                                + " for "
                                + moneyControlEntry.getContractNotePayLoad().getTrades().size()
                                + " trades;")
                        .build()
                    : moneyControlEntry)
        .collect(Collectors.toList());
  }
}
