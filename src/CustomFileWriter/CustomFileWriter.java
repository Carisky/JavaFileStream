package CustomFileWriter;

import utils.ConsoleColorOut.ConsoleColorOut;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CustomFileWriter {
    public static void writeStringToFile(String filePath, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception according to your needs
        }
    }

    public static void writeArrayToFile(String filePath, int[] array) {
        try {
            String originalArray = Arrays.toString(array);

            String evenNumbers = Arrays.toString(Arrays.stream(array).filter(num -> num % 2 == 0).toArray());

            String oddNumbers = Arrays.toString(Arrays.stream(array).filter(num -> num % 2 != 0).toArray());

            int[] reversedArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                reversedArray[i] = array[array.length - 1 - i];
            }
            String reversed = Arrays.toString(reversedArray);

            writeStringToFile(filePath, originalArray + "\n" + evenNumbers + "\n" + oddNumbers + "\n" + reversed);
            ConsoleColorOut.GREEN("Data wroted to file succesfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
