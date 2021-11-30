package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Entry {

  protected Map<String, Float> entryMap;
  protected ArrayList<String> columnNames;
  protected String entryID;

  public Entry() {
    entryMap = new HashMap<>();
    columnNames = new ArrayList<>();
    entryID = "";
  }

  /**
   * @param columnNames namees of the columns
   * @param entryID     entry identifyer
   * @param entries     content of the columns
   */
  public Entry(ArrayList<String> columnNames, String entryID, ArrayList<Float> entries) {
    this.entryID = entryID;
    this.columnNames = columnNames;
    entryMap = new HashMap<>();
    for (int i = 0; i < columnNames.size(); i++) {
      if (i < entries.size()) {
        entryMap.put(columnNames.get(i), entries.get(i));
      } else {
        entryMap.put(columnNames.get(i), null);
      }
    }
  }

  /**
   * Finds the dataset where the values in the two defined columns is the smallest
   *
   * @param data      the parsed dataset
   * @param columnOne name of the first column
   * @param columnTwo name of the second column
   * @return entryID of the entry with the smallest difference between the two specified columns
   */
  public static String getKeyOfMinimumSpread(CsvData data, String columnOne, String columnTwo) {
    String currentMinDayId = "";
    Float minTempSpread = null;
    for (Entry entry : data.dataEntries.values()) {
      if (minTempSpread != null) {
        Float deltaTemp = Math.abs(entry.getEntryMap().get(columnOne) - entry.getEntryMap().get(columnTwo));
        if (minTempSpread > deltaTemp) {
          currentMinDayId = entry.entryID;
          minTempSpread = deltaTemp;
        }
      } else {
        currentMinDayId = entry.getEntryID();
        minTempSpread = Math.abs(entry.getEntryMap().get(columnOne) - entry.getEntryMap().get(columnTwo));
      }
    }
    return currentMinDayId;
  }

  public Map<String, Float> getEntryMap() {
    return entryMap;
  }

  public ArrayList<String> getColumnNames() {
    return columnNames;
  }

  public String getEntryID() {
    return entryID;
  }
}
