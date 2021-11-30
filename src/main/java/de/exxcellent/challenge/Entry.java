package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Entry {
  private Map<String, Float> entryMap;
  private ArrayList<String> columnNames;
  private String entryID;

  public Entry(){
  }

  public
  Entry(ArrayList<String> columnNames,String entryID, ArrayList<Float> entries){
    this.entryID=entryID;
    this.columnNames= columnNames;
    entryMap = new HashMap<>();
    for(int i = 0; i<columnNames.size(); i++){
      if(i<entries.size()){
        entryMap.put(columnNames.get(i),entries.get(i));
      }else {
        entryMap.put(columnNames.get(i),null);
      }
    }
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
