package com.sumeetsahu.importer.read;

import com.sumeetsahu.importer.model.ContractNote;
import com.sumeetsahu.zerodha.model.ZerodhaContractNote;
import com.sumeetsahu.zerodha.model.ZerodhaContractNote.Contracts.Contract;
import com.sumeetsahu.zerodha.model.ZerodhaContractNote.Contracts.Contract.Totals.Subtotals.Charges.Charge;
import com.sumeetsahu.zerodha.model.ZerodhaContractNote.Contracts.Contract.Trades.Trade;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.val;

@RequiredArgsConstructor
public class ZerodhaXmlReader implements XmlReader {

  @NonNull String path;

  private static BigDecimal findFirstGrandTotalValueByType(Contract contract, String obligation)
      throws Throwable {
    return contract.getTotals().getGrandtotals().getGrandtotal().stream()
        .filter(grandtotal -> obligation.equalsIgnoreCase(grandtotal.getType()))
        .findFirst()
        .orElseThrow(
            (Supplier<Throwable>)
                () ->
                    new RuntimeException(
                        "Could not find `Net amount Receivable by Client / (Payable by Client)` in Contract id:"
                            + contract.getId()))
        .getValue();
  }

  @Override
  public List<ContractNote> read() throws Throwable {
    ZerodhaContractNote zerodhaContactNote;
    try {
      JAXBContext jaxbContext = JAXBContext.newInstance(ZerodhaContractNote.class);
      Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
      zerodhaContactNote = (ZerodhaContractNote) jaxbUnmarshaller.unmarshal(new File(path));
    } catch (JAXBException e) {
      throw new RuntimeException(e);
    }

    List<ContractNote> contractNotes =
        new ArrayList<>(
            Objects.requireNonNull(zerodhaContactNote).getContracts().getContract().size());

    for (Contract contract : zerodhaContactNote.getContracts().getContract()) {
      @NonNull
      List<Trade> trades =
          contract.getTrades().getTrade().stream()
              .peek(
                  trade -> {
                    val timeStamp = trade.getTimestamp();
                    timeStamp.setDay(contract.getTimestamp().getDay());
                    timeStamp.setMonth(contract.getTimestamp().getMonth());
                    timeStamp.setYear(contract.getTimestamp().getYear());
                    timeStamp.setTimezone(contract.getTimestamp().getTimezone());
                  })
              .collect(Collectors.toList());
      @NonNull
      List<Charge> additionalCharges =
          contract.getTotals().getSubtotals().getCharges().getCharge().stream()
              .filter(charge -> !"Exchange Obligation Account".equals(charge.getName()))
              .collect(Collectors.toList());
      ContractNote contractNote =
          new ContractNote(
              trades,
              additionalCharges,
              findFirstGrandTotalValueByType(contract, "obligation"),
              findFirstGrandTotalValueByType(contract, "net"),
              contract);
      contractNotes.add(contractNote);
    }

    return contractNotes;
  }
}
