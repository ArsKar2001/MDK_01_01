package algorithms;

import java.util.Arrays;
import java.util.Random;

public class Task_08 {

    private final double minValue;
    private final double maxValue;
    private double[] arrayDouble;

    public Task_08() {
        generateArray();
        minValue = GetMinValue();
        maxValue = GetMaxValue();
    }

    private void generateArray() {
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

    public String outputArray() {
        return Arrays.toString(arrayDouble);
    }

    public double getMinValue() {
        return minValue;
    }

    public double getMaxValue() {
        return maxValue;
    }
}
