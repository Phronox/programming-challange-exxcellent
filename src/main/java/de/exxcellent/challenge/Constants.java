package de.exxcellent.challenge;

public final class Constants {
  public interface DirectoryPaths {
    public static  String challangeCodePath = "src/main/java/de/exxcellent/challenge/";
    public static  String challangeResourcesPath = "src/main/resources/de/exxcellent/challenge/";
  }

  public interface filePaths{
    public static String weatherPath = DirectoryPaths.challangeResourcesPath + "weather_tmp.csv";
  }
  public interface testFilePaths{
    public static String testsDir = "src/test/java/de/exxcellent/challenge";
    public static String testFilesDir =  testsDir+ "testFiles/";
    public static String filePathReadFileTestData = testFilesDir + "readFileTestData.txt";
    public static String filePathTestData = testFilesDir + "testData.csv";
  }
}
