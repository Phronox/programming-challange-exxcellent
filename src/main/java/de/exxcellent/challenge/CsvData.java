package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.Map;

public class CsvData implements  Data{
  private Map<String, Entry> dataEntries;
  private String dataID;
  private char seperator;

  public CsvData() {
  }

  public CsvData(String DataID, char seperator, String[] data) {
  }

  @Override
  public Map<String, Entry> getDataEntries() {
    return dataEntries;
  }

  @Override
  public String getDataId() {
    return dataID;
  }

  @Override
  public void setData(String DataID, char seperator, String[] data) {

  }

  @Override
  public void setDataID(String datatID) {
    this.dataID = datatID;
  }

  @Override
  public void addEntry(Entry toAdd) {

  }

  @Override
  public void setColumnNames(ArrayList<String> columnNames) {

  }

  @Override
  public ArrayList<String> getColumnNames() {
    return null;
  }

  @Override
  public void setSeperator(char seperator) {
    this.seperator=seperator;
  }
}
