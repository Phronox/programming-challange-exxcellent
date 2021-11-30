package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import static de.exxcellent.challenge.Constants.filePaths.*;

public class Utils {

  /**
   * Reads a file and returns the single lines in an Array
   * @param relativeFilePath  the path to the file from content root
   * @return  array of lines
   */
  public static String[] readFile(String relativeFilePath){
    String[] lines=null;
    return lines;
  }

  /**
   * Parses the given data according to the filetype of dataID.
   * @param dataID  data identifyer and filetype descriptor
   * @param seperator the char that seperates the columns
   * @param data  the data to be parsed. First line must contain the column names
   * @return the parsed Data or null, if the filetype is not supported
   */
  public static Data parseData(String dataID, char seperator,String[] data){
    return null;
  }

}
