package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static de.exxcellent.challenge.Constants.testFilePaths.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Example JUnit 5 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
class AppTest {

    private String testDataDataID= "testData";
    private static ArrayList<String> testDataEntryIDs = new ArrayList<>(Arrays.asList("first","2","3rd","","5th"));

//    private static ArrayList<String> testDataColumnNames = new ArrayList<>(Arrays.asList("test1","test 2"));
//    private static ArrayList<Float> testDataEntriesLineOne= new ArrayList<>(Arrays.asList(1f,2.3f));
//    private static ArrayList<Float> testDataEntriesLineTwo= new ArrayList<>(Arrays.asList(2f,2f));
//    private static ArrayList<Float> testDataEntriesLineThree= new ArrayList<>(Arrays.asList(1f));
//    private static ArrayList<Float> testDataEntriesLineFour= new ArrayList<>(Arrays.asList());
//    private static ArrayList<Float> testDataEntriesLineFive= new ArrayList<>(Arrays.asList(6f,7f));

    private String successLabel = "not successful";

    @BeforeEach
    void setUp() {
        successLabel = "successful";
    }

    @Test
    void fileTests() {
        String[] readFileTestData = new String[]{"Test line 1","Test line 2"};
        assertEquals(readFileTestData[0], Utils.readFile(filePathReadFileTestData)[0], "Read a simple file 1");
        assertEquals(readFileTestData[1], Utils.readFile(filePathReadFileTestData)[1], "Read a simple file 2");
    }
    @Test
    void dataEntryTest(){
        ArrayList<String> testDataColumnNames = new ArrayList<>(Arrays.asList("test1","test 2"));
        ArrayList<Float> testDataEntriesLineOne= new ArrayList<>(Arrays.asList(1f,2.3f));
        Entry tEntry = new Entry(testDataColumnNames,"EntryID1",testDataEntriesLineOne);
        assertEquals(1f,tEntry.getEntryMap().get("test1"), "Simple Entry test" );

    }
    @Test
    void parseDataTest(){
        Data readData = Utils.parseData("testData.csv",',', Utils.readFile(filePathTestData));
        Data trueData = getTestDataObject();
        assertEquals(trueData.getDataId(),readData.getDataId(), "DataId" );
        assertEquals(trueData.getDataEntries().get("first").getEntryMap().get("test1"),
                     readData.getDataEntries().get("first").getEntryMap().get("test1"), "First entry, first column" );
        assertEquals(trueData.getDataEntries().get("2").getEntryMap().get("test 2"),
            readData.getDataEntries().get("2").getEntryMap().get("test 2"), "Second entry, second column");
//        assertNotEquals(trueData.getDataEntries().get("3rd").getEntryMap().get("test 2"),
//            readData.getDataEntries().get("3rd").getEntryMap().get("/"), "Third entry, second column, special char");
    }

    Data getTestDataObject(){
        String[] readFileTestData = new String[]{"Test line 1","Test line 2"};
        ArrayList<String> testDataColumnNames = new ArrayList<>(Arrays.asList("test1","test 2"));
        ArrayList<Float> testDataEntriesLineOne= new ArrayList<>(Arrays.asList(1f,2.3f));
        ArrayList<Float> testDataEntriesLineTwo= new ArrayList<>(Arrays.asList(2f,2f));
        ArrayList<Float> testDataEntriesLineThree= new ArrayList<>(Arrays.asList(1f));
        ArrayList<Float> testDataEntriesLineFour= new ArrayList<>(Arrays.asList());
        ArrayList<Float> testDataEntriesLineFive= new ArrayList<>(Arrays.asList(6f,7f));
        CsvData dataObj = new CsvData();
        dataObj.setDataID("testData.csv");
        dataObj.setColumnNames(testDataColumnNames);
        dataObj.setSeperator(',');
        dataObj.addEntry(new Entry(testDataColumnNames, testDataEntryIDs.get(0) , testDataEntriesLineOne));
        dataObj.addEntry(new Entry(testDataColumnNames, testDataEntryIDs.get(1), testDataEntriesLineTwo));
        dataObj.addEntry(new Entry(testDataColumnNames, testDataEntryIDs.get(2), testDataEntriesLineThree));
        dataObj.addEntry(new Entry(testDataColumnNames, testDataEntryIDs.get(3), testDataEntriesLineFour));
        dataObj.addEntry(new Entry(testDataColumnNames, testDataEntryIDs.get(4), testDataEntriesLineFive));
        return dataObj;
    }



    @Test
    void aPointlessTest() {
        assertEquals("successful", successLabel, "My expectations were not met");
    }

    @Test
    void runFootball() {
        App.main("--football", "football.csv");
    }

}