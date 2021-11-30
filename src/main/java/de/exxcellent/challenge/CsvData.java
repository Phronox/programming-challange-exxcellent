package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CsvData implements Data {

  protected Map<String, Entry> dataEntries;
  protected String dataID;
  protected char seperator;
  protected ArrayList<String> columnNames;

  public CsvData() {
    dataEntries = new HashMap<>();
    dataID = "";
    columnNames = new ArrayList<>();
  }

  /**
   * @param dataID    data identifyer and filetype descriptor
   * @param seperator the char that seperates the columns
   * @param data      the data to be parsed. First line must contain the column names
   */
  public CsvData(String dataID, char seperator, String[] data) {
    parseData(dataID, seperator, data);
  }

  @Override
  public Map<String, Entry> getDataEntries() {
    return dataEntries;
  }

  @Override
  public String getDataID() {
    return dataID;
  }

  /**
   * Parses the data
   *
   * @param dataID    data identifyer and filetype descriptor
   * @param seperator the char that seperates the columns
   * @param data      the data to be parsed. First line must contain the column names
   */
  @Override
  public void parseData(String dataID, char seperator, String[] data) {
    if (data.length < 1) {
      throw new IllegalArgumentException(
          "Parameter data must contain at least one line (the column names)");
    }
    this.dataID = dataID;
    this.seperator = seperator;
    dataEntries = new HashMap<>();
    columnNames = new ArrayList<>();
    String[] columnNamesTmp = data[0].split(Character.toString(seperator));
    for (int i = 0; i < columnNamesTmp.length; i++) {
      columnNames.add((columnNamesTmp[i].trim()));
    }
    if (data.length > 1) {
      for (int i = 1; i < data.length; i++) {
        String[] thisLine = data[i].split(Character.toString(seperator));
        if (thisLine.length > 1) {
          ArrayList<Float> entries = new ArrayList<>();
          for (int j = 1; j < thisLine.length; j++) {
            entries.add(Float.parseFloat(thisLine[j]));
          }
          Entry lineEntry = new Entry(new ArrayList(columnNames.subList(1, columnNames.size())), thisLine[0], entries);
          dataEntries.put(thisLine[0], lineEntry);
        }
      }
    }
  }

  @Override
  public void setDataID(String datatID) {
    this.dataID = datatID;
  }

  @Override
  public void addEntry(Entry toAdd) {
    dataEntries.put(toAdd.getEntryID(), toAdd);
  }

  @Override
  public void setColumnNames(ArrayList<String> columnNames) {
    this.columnNames = columnNames;
  }

  @Override
  public ArrayList<String> getColumnNames() {
    return columnNames;
  }

  @Override
  public void setSeperator(char seperator) {
    this.seperator = seperator;
  }
}
