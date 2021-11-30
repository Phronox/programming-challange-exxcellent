package de.exxcellent.challenge;

public final class Constants {

  public interface directoryPaths {

    String challengeCodePath = "src/main/java/de/exxcellent/challenge/";
    String challengeResourcesPath = "src/main/resources/de/exxcellent/challenge/";
  }

  public interface filePaths {
    String weather = directoryPaths.challengeResourcesPath + "weather.csv";
  }

  public interface testFilePaths {

    String testsDir = "src/test/java/de/exxcellent/challenge/";
    String testFilesDir = testsDir + "testFiles/";
    String filePathReadFileTestData = testFilesDir + "readFileTestData.txt";
    String filePathTestData = testFilesDir + "testData.csv";
  }
}
