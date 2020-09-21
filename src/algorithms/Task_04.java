package algorithms;

import java.util.Arrays;
import java.util.Random;

public class Task_04 {

    private static int[] arrayInt;

    public Task_04() {
        GenerateArray();
    }

    private void GenerateArray() {
        Random random = new Random();
        arrayInt = new int[(int) (5 + Math.random() * 10)];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(10);
        }
    }

    public String OutputSortArray() {
        Arrays.sort(arrayInt);
        return Arrays.toString(arrayInt);
    }

    public String OutputArray() {
        return Arrays.toString(arrayInt);
    }
}