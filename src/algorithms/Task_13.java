package algorithms;

import java.util.Random;

public class Task_13 {
    private int[][] matrix1;
    private int[][] matrix2;
    private int size;

    public Task_13() {
        generateMatrices();
    }

    private void generateMatrices() {
        Random random = new Random();
        size = random.nextInt(2) + 2;
        matrix1 = new int[size][size];
        matrix2 = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix1[i][j] = random.nextInt(5);
                matrix2[i][j] = random.nextInt(5);
            }
        }
    }

    private int[][] sumMatrix() {
        int[][] sumMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    private int[][] mulMatrix() {
        int[][] mulMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mulMatrix[i][j] += matrix1[i][j] * matrix2[i][j];
            }
        }
        return mulMatrix;
    }

    public String getMulMatrix() {
        return getStringMatrix(mulMatrix());
    }

    public String getSumMatrix() {
        return getStringMatrix(sumMatrix());
    }

    public String getMatrix1() {
        return getStringMatrix(matrix1);
    }

    private String getStringMatrix(int[][] matrix1) {
        String str = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                str += matrix1[i][j] + "\t";
            }
            str += "\n";
        }
        return str;
    }

    public String getMatrix2() {
        return getStringMatrix(matrix2);
    }
}
