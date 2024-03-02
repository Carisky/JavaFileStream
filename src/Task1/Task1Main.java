package Task1;


import FileComparer.FileComparer;
import TestFiles.FilePaths;

public class Task1Main {
    public static void main(String[] args) {
        FileComparer.TextFileCompare(FilePaths.getTextFiles().get(0).getFilePath(),FilePaths.getTextFiles().get(1).getFilePath());
    }
}
