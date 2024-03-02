package FileComparer;

import utils.ConsoleColorOut.ConsoleColorOut;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static FileReader.FileReader.FileGetIntArrays;
import static FileReader.FileReader.FileGetLines;

public class FileComparer {
    public static void TextFileCompare(String filePath1, String filePath2){
        List<String> lines1 = FileGetLines(filePath1);
        List<String> lines2 = FileGetLines(filePath2);

        assert lines1 != null;
        assert lines2 != null;

        final int MIN_LENGTH= Math.min(lines1.size(), lines2.size());

        for (int i = 0; i < MIN_LENGTH; i++) {
            String lineFromFile1 = lines1.get(i);
            String lineFromFile2 = lines2.get(i);

            if (!lineFromFile1.equals(lineFromFile2)) {
                System.out.println("Lines have diff");

                ConsoleColorOut.PURPLE(i+"'s "+"Line from 1 file");
                ConsoleColorOut.CYAN(lineFromFile1);

                ConsoleColorOut.PURPLE(i+"'s "+"Line from 2 file");
                ConsoleColorOut.YELLOW(lineFromFile2);
            }
        }
    }

    public static void TextFileShowMaxLine(String filePath){
        List<String> lines = FileGetLines(filePath);

        assert lines != null;
        String MAX_STRING = lines.stream()
                .max(Comparator.comparing(String::length))
                .orElse(null);

        int INDEX_OF_MAX_STRING = IntStream.range(0, lines.size())
                .boxed()
                .max(Comparator.comparing(i -> lines.get(i).length()))
                .orElse(-1);

        ConsoleColorOut.PURPLE(MAX_STRING);
        ConsoleColorOut.YELLOW("Index "+INDEX_OF_MAX_STRING);
    }

    public static void IntArraysFileShowStats(String filePath, String separator){
        List<int[]> intArrays = FileGetIntArrays(filePath, separator);

        for (int i = 0; i < intArrays.size(); i++) {
            int[] array = intArrays.get(i);

            // Display each array
            ConsoleColorOut.PURPLE("Array " + i + ":");
            ConsoleColorOut.CYAN(Arrays.toString(array));

            // Calculate and display array statistics
            int min = Arrays.stream(array).min().orElseThrow();
            int max = Arrays.stream(array).max().orElseThrow();
            int sum = Arrays.stream(array).sum();

            ConsoleColorOut.YELLOW("Min: " + min);
            ConsoleColorOut.YELLOW("Max: " + max);
            ConsoleColorOut.YELLOW("Sum: " + sum);

            // Add a separator between arrays for clarity
            System.out.println("--------------------------");
        }

        // Calculate and display overall statistics
        int overallMin = intArrays.stream()
                .flatMapToInt(Arrays::stream)
                .min()
                .orElseThrow();
        int overallMax = intArrays.stream()
                .flatMapToInt(Arrays::stream)
                .max()
                .orElseThrow();
        int overallSum = intArrays.stream()
                .flatMapToInt(Arrays::stream)
                .sum();

        ConsoleColorOut.PURPLE("Overall Statistics:");
        ConsoleColorOut.YELLOW("Overall Min: " + overallMin);
        ConsoleColorOut.YELLOW("Overall Max: " + overallMax);
        ConsoleColorOut.YELLOW("Overall Sum: " + overallSum);
    }
}
