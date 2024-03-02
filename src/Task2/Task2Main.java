package Task2;

import FileComparer.FileComparer;
import TestFiles.FilePaths;

public class Task2Main {
    public static void main(String[] args) {
        FileComparer.TextFileShowMaxLine(FilePaths.getTextFiles().getFirst().getFilePath());
    }
}
