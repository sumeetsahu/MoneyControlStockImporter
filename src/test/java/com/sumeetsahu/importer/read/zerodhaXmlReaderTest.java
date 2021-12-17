package com.sumeetsahu.importer.read;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.sumeetsahu.importer.model.ContractNote;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class zerodhaXmlReaderTest {

  private static final int EXPECTED = 13;
  private zerodhaXmlReader zerodhaXmlReaderUnderTest;

  @BeforeEach
  void setUp() {
    zerodhaXmlReaderUnderTest = new zerodhaXmlReader("src/test/resources/ZerodhaContractNote.xml");
  }

  @Test
  void testRead() {

    // Run the test
    final List<ContractNote> result = zerodhaXmlReaderUnderTest.read();

    // Verify the results
    assertEquals(EXPECTED, result.size());
  }
}
