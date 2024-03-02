package TestFiles;

import java.util.Arrays;
import java.util.List;

public enum FilePaths {
    FILE1("src/TestFiles/TestText1.txt"),
    FILE2("src/TestFiles/TestText2.txt"),
    FILE3("src/TestFiles/TestIntArray1.txt"),

    FILE4("src/TestFiles/OutputFiles/OutputArrays.txt"),
    FILE5("src/TestFiles/CorporationSystem/Employes.txt");
    private final String filePath;

    FilePaths(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    private static final List<FilePaths> TEXT_FILES = Arrays.asList(FILE1, FILE2);
    private static final List<FilePaths> INT_ARRAYS_FILES = Arrays.asList(FILE3);
    private static final List<FilePaths> INT_ARRAYS_OUTPUT_FILES = Arrays.asList(FILE4);
    private static final List<FilePaths> CORPORATION_SYSTEM = Arrays.asList(FILE5);
    public static List<FilePaths> getTextFiles() {
        return TEXT_FILES;
    }

    public static List<FilePaths> getIntArraysFiles() {
        return INT_ARRAYS_FILES;
    }

    public static List<FilePaths> getIntOutputArraysFiles() { return INT_ARRAYS_OUTPUT_FILES; }

    public static List<FilePaths> getCorporationSystemFiles() { return CORPORATION_SYSTEM; }
    public static FilePaths getCorporationSystemEmploesStorage() { return CORPORATION_SYSTEM.get(0); }

}