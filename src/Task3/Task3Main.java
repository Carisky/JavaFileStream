package Task3;

import FileComparer.FileComparer;
import TestFiles.FilePaths;

public class Task3Main {
    public static void main(String[] args) {
        FileComparer.IntArraysFileShowStats(FilePaths.getIntArraysFiles().getFirst().getFilePath()," ");
    }
}
