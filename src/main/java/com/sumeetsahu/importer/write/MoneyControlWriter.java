package com.sumeetsahu.importer.write;

import com.sumeetsahu.moneycontrol.model.MoneyControlEntry;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

@RequiredArgsConstructor
public class MoneyControlWriter {

  @NonNull String path;
  String[] HEADERS = {
    "ISIN Code",
    "Enter Full/Partial Stock Name",
    "Date",
    "Transaction Type (Enter Either Buy or Sell)",
    "Exchange",
    "Qty",
    "Purchase/Sell price per share",
    "Total Amount",
    "Total Charges (Brokerage +Other charges)",
    "Net Amount",
    "Note",
    "Order Number",
    "Transaction Number",
    "Contract Note Number",
    "Brokerage",
    "Other Charges (All Charges other than brokerage charges)",
    "Service Tax/GST",
    "STT",
    "Exchange Charges",
    "Stamp Duty",
    "SEBI Charges"
  };
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  public void write(List<MoneyControlEntry> entries) throws IOException {
    FileWriter out = new FileWriter(path);
    try (CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT.withHeader(HEADERS))) {
      printer.printRecord(
          "",
          "Mandatory",
          "Mandatory",
          "Mandatory",
          "Mandatory",
          "Mandatory",
          "Mandatory",
          "Optional",
          "Optional",
          "Optional",
          "Optional",
          "Optional",
          "Optional",
          "Optional",
          "Optional",
          "Optional",
          "Optional",
          "Optional",
          "Optional",
          "Optional",
          "Optional");
      entries.forEach(
          moneyControlEntry -> {
            try {
              printer.printRecord(
                  moneyControlEntry.getIsinCode(),
                  moneyControlEntry.getStockName(),
                  moneyControlEntry.getDate().format(formatter),
                  moneyControlEntry.getTransactionType().value(),
                  moneyControlEntry.getExchange().name(),
                  moneyControlEntry.getQuantity(),
                  moneyControlEntry.getPricePerShare(),
                  moneyControlEntry.getTotalAmount(),
                  moneyControlEntry.getTotalCharges(),
                  moneyControlEntry.getNetAmount(),
                  moneyControlEntry.getNote()
                      + "Generated using: https://github.com/sumeetsahu/MoneyControlStockImporter ;",
                  moneyControlEntry.getOrderId(),
                  moneyControlEntry.getTransactionId(),
                  moneyControlEntry.getContractNoteId(),
                  moneyControlEntry.getBrokerage(),
                  moneyControlEntry.getOtherCharges(),
                  moneyControlEntry.getServiceTax(),
                  moneyControlEntry.getStt(),
                  moneyControlEntry.getExchangeCharge(),
                  moneyControlEntry.getStampDuty(),
                  moneyControlEntry.getSebiCharges());
            } catch (IOException e) {
              e.printStackTrace();
            }
          });
    }
  }
}
