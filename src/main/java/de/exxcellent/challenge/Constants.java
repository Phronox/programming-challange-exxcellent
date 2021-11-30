package de.exxcellent.challenge;

public final class Constants {
  public interface DirectoryPaths {
    public static  String challengeCodePath = "src/main/java/de/exxcellent/challenge/";
    public static  String challengeResourcesPath = "src/main/resources/de/exxcellent/challenge/";
  }

  public interface filePaths{
    public static String weatherPath = DirectoryPaths.challengeResourcesPath + "weather_tmp.csv";
  }
  public interface testFilePaths{
    public static String testsDir = "src/test/java/de/exxcellent/challenge/";
    public static String testFilesDir =  testsDir+ "testFiles/";
    public static String filePathReadFileTestData = testFilesDir + "readFileTestData.txt";
    public static String filePathTestData = testFilesDir + "testData.csv";
  }
}
