package algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Task_06 {

    private static Integer[] arrayInt;

    public Task_06() {
        GenerateArray();
    }

    private void GenerateArray() {
        Random random = new Random();
        arrayInt = new Integer[5];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(5);
        }
    }

    private Integer[] GetSortBeginArray() {
        Integer[] sortArray = arrayInt.clone();
        Arrays.sort(sortArray);
        return sortArray;
    }

    private Integer[] GetSortEndArray() {
        Integer[] sortArray = arrayInt.clone();
        Arrays.sort(sortArray, Collections.reverseOrder());
        return sortArray;
    }

    public String GetResult() {
        if(Arrays.deepEquals(arrayInt, GetSortBeginArray()) || Arrays.deepEquals(arrayInt, GetSortEndArray())) {
            return "Массив упорядоченный";
        }
        else {
            return "Массив неупорядоченный";
        }
    }

    public String OutputArray() {
        return Arrays.toString(arrayInt);
    }
}
