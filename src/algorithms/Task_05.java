package algorithms;

import java.util.Arrays;
import java.util.Random;

public class Task_05 {

    private static double[] arrayDouble;
    public static double maxValue;
    public static double minValue;

    public Task_05() {
        generateArray();
        minValue = getMinValue();
        maxValue = getMaxValue();
    }

    private void generateArray() {
        Random random = new Random();
        arrayDouble = new double[(int) (5 + Math.random() * 10)];
        for (int i = 0; i < arrayDouble.length; i++) {
            arrayDouble[i] = (double) Math.round(random.nextDouble() * 100) / 100;
        }
    }

    private double getMinValue() {
        double val = arrayDouble[0];
        for (int i = 0; i < arrayDouble.length; i++) {
            if(val > arrayDouble[i]) val = arrayDouble[i];
        }
        return val;
    }

    private double getMaxValue() {
        double val = arrayDouble[0];
        for (int i = 0; i < arrayDouble.length; i++) {
            if(val < arrayDouble[i]) val = arrayDouble[i];
        }
        return val;
    }

    public double difference() {
        return (double) Math.round((maxValue - minValue) * 100) / 100;
    }

    public String outputArray() {
        return Arrays.toString(arrayDouble);
    }
}
