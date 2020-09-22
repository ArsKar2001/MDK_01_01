package algorithms;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class Task_09 {

    private static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static final String lower = upper.toLowerCase(Locale.ROOT);

    private final Random random = new Random();

    private static String[] arrayStr;

    public Task_09() {
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

    private String getMaxString() {
        String str = arrayStr[0];
        for (String item:
             arrayStr) {
            if (str.length() < item.length())
                str = item;
        }
        return str;
    }

    public String outputMaxString() {
        return getMaxString();
    }

    public String outputArrayStr() {
        return Arrays.toString(arrayStr);
    }
}
