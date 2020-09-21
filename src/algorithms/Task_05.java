package algorithms;

import java.util.Arrays;
import java.util.Random;

public class Task_05 {

    private static double[] arrayDouble;
    public static double maxValue;
    public static double minValue;

    public Task_05() {
        GenerateArray();
        minValue = GetMinValue();
        maxValue = GetMaxValue();
    }

    private void GenerateArray() {
        Random random = new Random();
        arrayDouble = new double[(int) (5 + Math.random() * 10)];
        for (int i = 0; i < arrayDouble.length; i++) {
            arrayDouble[i] = (double) Math.round(random.nextDouble() * 100) / 100;
        }
    }

    private double GetMinValue() {
        double val = arrayDouble[0];
        for (int i = 0; i < arrayDouble.length; i++) {
            if(val > arrayDouble[i]) val = arrayDouble[i];
        }
        return val;
    }

    private double GetMaxValue() {
        double val = arrayDouble[0];
        for (int i = 0; i < arrayDouble.length; i++) {
            if(val < arrayDouble[i]) val = arrayDouble[i];
        }
        return val;
    }

    public double Difference() {
        return (double) Math.round((maxValue - minValue) * 100) / 100;
    }

    public String OutputArray() {
        return Arrays.toString(arrayDouble);
    }
}
