package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.Map;

public class Entry {
  private Map<String, Float> entryMap;
  private ArrayList<String> entryNames;
  private String entryID;
  public Entry(){
  }
  public
  Entry(ArrayList<String> columnNames,String entryID, ArrayList<Float> entries){
  }

  public Map<String, Float> getEntryMap() {
    return entryMap;
  }

  public ArrayList<String> getEntryNames() {
    return entryNames;
  }

  public String getEntryID() {
    return entryID;
  }
}
