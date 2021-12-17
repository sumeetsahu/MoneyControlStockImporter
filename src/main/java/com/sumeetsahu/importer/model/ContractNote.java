package com.sumeetsahu.importer.model;

import com.sumeetsahu.zerodha.model.ContractNote.Contracts.Contract.Totals.Subtotals.Charges.Charge;
import com.sumeetsahu.zerodha.model.ContractNote.Contracts.Contract.Trades.Trade;
import java.util.List;
import lombok.NonNull;
import lombok.Value;

@Value
public class ContractNote {

  @NonNull List<Trade> trades;
  @NonNull List<Charge> additionalChargesPerContract;
}
