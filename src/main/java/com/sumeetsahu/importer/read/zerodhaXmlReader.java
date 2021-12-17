package com.sumeetsahu.importer.read;

import com.sumeetsahu.importer.model.ContractNote;
import com.sumeetsahu.zerodha.model.ZerodhaContractNote;
import com.sumeetsahu.zerodha.model.ZerodhaContractNote.Contracts.Contract;
import com.sumeetsahu.zerodha.model.ZerodhaContractNote.Contracts.Contract.Totals.Subtotals.Charges.Charge;
import com.sumeetsahu.zerodha.model.ZerodhaContractNote.Contracts.Contract.Trades.Trade;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class zerodhaXmlReader implements XmlReader {

  @NonNull String path;

  @Override
  public List<ContractNote> read() {
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
      @NonNull List<Trade> trades = contract.getTrades().getTrade();
      @NonNull
      List<Charge> additionalCharges =
          contract.getTotals().getSubtotals().getCharges().getCharge().stream()
              .filter(charge -> !"Exchange Obligation Account".equals(charge.getName()))
              .collect(Collectors.toList());
      ContractNote contractNote = new ContractNote(trades, additionalCharges);
      contractNotes.add(contractNote);
    }

    return contractNotes;
  }
}
