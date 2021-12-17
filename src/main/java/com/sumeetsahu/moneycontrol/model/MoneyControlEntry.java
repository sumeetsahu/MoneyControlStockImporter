package com.sumeetsahu.moneycontrol.model;

import com.sumeetsahu.importer.model.ContractNote;
import com.sumeetsahu.zerodha.model.ZerodhaContractNote;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

// Date	TransactionType (Enter Either Buy or Sell)	Exchange	Qty	Purchase/Sell price per share	Total
// Amount	Net Amount	Note	Order Number	Transaction Number	Contract Note Number	Brokerage	Other
// Charges (All Charges other than brokerage charges)	Service Tax/GST	STT	Exchange Charges	Stamp
// Duty	SEBI Charges
@Value
@Builder(toBuilder = true)
public class MoneyControlEntry {

  @NonNull String isinCode;
  @NonNull String stockName;
  @NonNull LocalDate date;
  @NonNull TransactionType transactionType;
  @NonNull Exchange exchange;
  @NonNull Integer quantity;
  @NonNull BigDecimal pricePerShare;
  BigDecimal totalAmount;
  BigDecimal totalCharges;
  BigDecimal netAmount;
  String note;
  String orderId;
  String transactionId;
  String contractNoteId;
  BigDecimal brokerage;
  BigDecimal otherCharges;
  BigDecimal serviceTax;
  BigDecimal stt;
  BigDecimal exchangeCharge;
  BigDecimal stampDuty;
  BigDecimal sebiCharges;
  @NonNull ContractNote contractNotePayLoad;
}
