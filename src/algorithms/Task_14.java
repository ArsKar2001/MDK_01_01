package algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Random;
import java.util.stream.IntStream;

public class Task_14 {
    private static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static final String lower = upper.toLowerCase(Locale.ROOT);

    private final Random random = new Random();

    private static String[] arrayStr;

    public Task_14() {
        generateStringsArray();
    }

    private String newString() {
        StringBuilder str = new StringBuilder();
        str.append(upper.charAt(random.nextInt(upper.length())));
        for (int idx = 0; idx < 3 + random.nextInt(10); ++idx)
            str.append(lower.charAt(random.nextInt(lower.length())));
        return str.toString();
    }

    private void generateStringsArray() {
        arrayStr = new String[3 + random.nextInt(10)];
        for (int i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = newString();
        }
    }
    public String outputSortStrings() {
        Arrays.sort(arrayStr);
        return Arrays.toString(arrayStr);
    }
    public String outputStrings() {
        return Arrays.toString(arrayStr);
    }
}
