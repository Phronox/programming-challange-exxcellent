package de.exxcellent.challenge;

import java.util.Map;

public class CsvData implements  Data{
  private Map<String, Entry> dataEntries;
  private String dataID;
  private char seperator;

  @Override
  public void Data() {
  }

  @Override
  public void Data(String DataID, char seperator, String[] data) {
  }

  @Override
  public Map<String, Entry> getData() {
    return null;
  }

  @Override
  public String getFileName() {
    return null;
  }

  @Override
  public void setData(String DataID, char seperator, String[] data) {

  }

  @Override
  public void setFileName(String fileName) {

  }
}
