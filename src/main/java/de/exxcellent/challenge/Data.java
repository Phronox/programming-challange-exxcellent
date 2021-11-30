package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.Map;

public interface Data {
  Map<String, Entry> getDataEntries();
  String getDataID();
  void setData(String DataID, char seperator, String[] data);
  void setDataID(String dataID);
  void addEntry(Entry toAdd);
  void setColumnNames(ArrayList<String> columnNames);
  ArrayList<String> getColumnNames();
  void setSeperator(char seperator);

}
