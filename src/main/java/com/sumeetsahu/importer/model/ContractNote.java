package com.sumeetsahu.importer.model;

import com.sumeetsahu.zerodha.model.ZerodhaContractNote;
import com.sumeetsahu.zerodha.model.ZerodhaContractNote.Contracts.Contract.Totals.Subtotals.Charges.Charge;
import com.sumeetsahu.zerodha.model.ZerodhaContractNote.Contracts.Contract.Trades.Trade;
import java.math.BigDecimal;
import java.util.List;
import lombok.NonNull;
import lombok.Value;

@Value
public class ContractNote {

  @NonNull List<Trade> trades;
  @NonNull List<Charge> additionalChargesPerContract;
  @NonNull BigDecimal obligation;
  @NonNull BigDecimal netPayable;
  @NonNull ZerodhaContractNote.Contracts.Contract contractPayLoad;
}
