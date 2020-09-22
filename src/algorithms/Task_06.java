package algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Task_06 {

    private static Integer[] arrayInt;

    public Task_06() {
        generateArray();
    }

    private void generateArray() {
        Random random = new Random();
        arrayInt = new Integer[5];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(5);
        }
    }

    private Integer[] getSortBeginArray() {
        Integer[] sortArray = arrayInt.clone();
        Arrays.sort(sortArray);
        return sortArray;
    }

    private Integer[] getSortEndArray() {
        Integer[] sortArray = arrayInt.clone();
        Arrays.sort(sortArray, Collections.reverseOrder());
        return sortArray;
    }

    public String getResult() {
        if(Arrays.deepEquals(arrayInt, getSortBeginArray()) || Arrays.deepEquals(arrayInt, getSortEndArray())) {
            return "Массив упорядоченный";
        }
        else {
            return "Массив неупорядоченный";
        }
    }

    public String outputArray() {
        return Arrays.toString(arrayInt);
    }
}
