package com.sumeetsahu.importer.read;

import com.sumeetsahu.importer.model.ContractNote;
import java.util.List;

public interface XmlReader {
  List<ContractNote> read();
}
