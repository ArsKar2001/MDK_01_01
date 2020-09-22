package algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Task_12 {

    private static String str;

    public Task_12(String str) {
        this.str = str;
    }

    public String outputSortStringCode() {
        char[] chars = str.toCharArray().clone();
        Character[] newArray = IntStream.range(0, chars.length)
                .mapToObj(i -> chars[i])
                .toArray(Character[]::new);
        Arrays.sort(newArray, Collections.reverseOrder());
        return Arrays.toString(newArray);
    }

    public String outputArray() {
        return Arrays.toString(str.toCharArray());
    }
}
