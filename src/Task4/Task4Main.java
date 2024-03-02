package Task4;

import CustomFileWriter.CustomFileWriter;
import TestFiles.FilePaths;
import utils.UserInput.UserInput;


public class Task4Main {
    public static void main(String[] args) {
        int[] array = UserInput.readIntArrayFromUser();

        CustomFileWriter.writeArrayToFile(FilePaths.getIntOutputArraysFiles().getFirst().getFilePath(), array);
    }
}
