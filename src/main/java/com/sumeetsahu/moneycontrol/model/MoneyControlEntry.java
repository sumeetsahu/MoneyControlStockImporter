package com.sumeetsahu.moneycontrol.model;

import java.time.LocalDate;
import lombok.NonNull;
import lombok.Value;

// Date	TransactionType (Enter Either Buy or Sell)	Exchange	Qty	Purchase/Sell price per share	Total
// Amount	Net Amount	Note	Order Number	Transaction Number	Contract Note Number	Brokerage	Other
// Charges (All Charges other than brokerage charges)	Service Tax/GST	STT	Exchange Charges	Stamp
// Duty	SEBI Charges
@Value
public class MoneyControlEntry {

  @NonNull String isinCode;
  @NonNull String stockName;
  @NonNull LocalDate date;
  @NonNull TransactionType transactionType;
  @NonNull Exchange exchange;
  @NonNull Integer Quantity;
  @NonNull Long pricePerShare;
  Integer totalAmount;
  Integer netAmount;
  String note;
  String orderId;
  String transactionId;
  String contractNoteId;
  Long brokerage;
  Long otherCharges;
  Long serviceTax;
  Long stt;
  Long exchangeCharge;
  Long stampDuty;
  Long sebiCharges;
}
