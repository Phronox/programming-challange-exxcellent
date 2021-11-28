package de.exxcellent.challenge;

import java.util.Map;

public interface Data {
  void Data();
  void Data(String DataID, char seperator, String[] data);
  Map<String, Entry> getData();
  String getFileName();
  void setData(String DataID, char seperator, String[] data);
  void setFileName(String fileName);

}
