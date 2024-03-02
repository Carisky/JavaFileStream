package FileReader;

import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReader {
    @Nullable
    public static List<String> FileGetLines(String filePath){
        try {
            return Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
        e.printStackTrace();
    }
        return null;
    }

    public static List<int[]> FileGetIntArrays(String filePath, String separator) {
        List<String> lines = FileGetLines(filePath);
        List<int[]> intArrays = new ArrayList<>();

        if (lines != null) {
            for (String line : lines) {
                String[] stringValues = line.split(separator);
                int[] intValues = Arrays.stream(stringValues)
                        .mapToInt(Integer::parseInt)
                        .toArray();

                intArrays.add(intValues);
            }
        }

        return intArrays;
    }
}
