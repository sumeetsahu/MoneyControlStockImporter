package com.sumeetsahu.importer.read;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.sumeetsahu.importer.model.ContractNote;
import com.sumeetsahu.importer.transforms.Transformer;
import com.sumeetsahu.importer.write.MoneyControlWriter;
import com.sumeetsahu.moneycontrol.model.MoneyControlEntry;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class zerodhaXmlReaderTest {

  private static final int EXPECTED = 13;
  private ZerodhaXmlReader zerodhaXmlReaderUnderTest;

  @BeforeEach
  void setUp() {
    zerodhaXmlReaderUnderTest = new ZerodhaXmlReader("src/test/resources/ZerodhaContractNote.xml");
  }

  @Test
  void testRead() throws Throwable {

    // Run the test
    final List<ContractNote> result = zerodhaXmlReaderUnderTest.read();

    // Verify the results
    assertEquals(EXPECTED, result.size());

    List<MoneyControlEntry> rr = Transformer.processTrades(result);
    List<MoneyControlEntry> aa = Transformer.processAdditionalCharge(rr);
    List<MoneyControlEntry> ss = Transformer.processTotalAmount(aa);
    List<MoneyControlEntry> dd = Transformer.trueUp(result, ss);
    MoneyControlWriter writer = new MoneyControlWriter("src/test/resources/Result.csv");
    writer.write(dd);
  }
}
