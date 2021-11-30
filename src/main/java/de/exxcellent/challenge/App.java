package de.exxcellent.challenge;

import de.exxcellent.challenge.Constants.directoryPaths;
import de.exxcellent.challenge.Constants.filePaths;
import java.util.Arrays;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed <mode> <fileName>.<ending>
     */
    public static void main(String... args) {
        String dataFilePath = "";
        char seperator = ',';
        CsvData data = null;
        String columnOne = "";
        String columnTwo = "";
        if(args.length == 2) {
            if (args[1].contains(".csv")) {
                String firstArg = args[0];
                dataFilePath = directoryPaths.challengeResourcesPath + args[1];
                if(firstArg.startsWith("--")&&firstArg.length()>2){
                    firstArg = firstArg.substring(2);
                }
                data = (CsvData) Utils.parseData(args[1], seperator, Utils.readFile(dataFilePath));
                switch (firstArg){
                    case "weather":
                        columnOne = "MxT";
                        columnTwo = "MnT";
                        String dayWithSmallestTempSpread = Entry.getKeyOfMinimumSpread(data,columnOne,columnTwo);
                        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
                        break;
                    case "football":
                        columnOne = "Goals";
                        columnTwo = "Goals Allowed";
                        String teamsWithSmallestGoalSpread = Entry.getKeyOfMinimumSpread(data,columnOne,columnTwo);
                        System.out.printf("Team with smallest goal spread       : %s%n", teamsWithSmallestGoalSpread);
                        break;
                    default:
                        throw new IllegalArgumentException("Mode " + args[0] +" is not supported");
                }

            }else{
                throw new IllegalArgumentException("File type is not supported");
            }
        }
    }
}
