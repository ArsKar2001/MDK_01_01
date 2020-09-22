package algorithms;

import java.util.Random;

public class Task_02 {

    /**
     *
     */
    private static int[][] matrix;

    /**
     *
     */
    public Task_02() {
        generateMatrix();
    }

    /**
     *
     */
    public void generateMatrix() {
        Random random = new Random();
        matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
    }

    /**
     * @return
     */
    private int getNumberOfMainDiagonal() {
        int num = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(i == j)
                if(num < matrix[i][j])
                    num = matrix[i][j];
            }
        }
        return num;
    }

    /**
     * @return
     */
    public String outputNumberOfMainDiagonal() {
        return "Наибольшее число главной диагонали: " + getNumberOfMainDiagonal();
    }

    /**
     * @param indexRow
     * @return
     */
    private int sumRows(int indexRow) {
        int sumRow = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumRow += matrix[indexRow][i];
        }
        return sumRow;
    }

    /**
     * @param indexColumns
     * @return
     */
    private int mulColumns(int indexColumns) {
        int mulCol = 1;
        for (int i = 0; i < matrix.length; i++) {
            mulCol *= matrix[i][indexColumns];
        }
        return mulCol;
    }

    /**
     * @return
     */
    public String outputSumRows() {
        String str = "";
        for (int i = 0; i < matrix.length; i++) {
            str += "Row(" + i + ") -> Sum(" + sumRows(i) + ");\n";
        }
        return str;
    }

    /**
     * @return
     */
    public String outputMulColumns() {
        String str = "";
        for (int i = 0; i < matrix.length; i++) {
            str += "Col(" + i + ") -> Mul(" + mulColumns(i) + ");\n";
        }
        return str;
    }

    /**
     * @return
     */
    public String OutputMatrix() {
        String str = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                str += matrix[i][j] + "\t";
            }
            str += "\n";
        }
        return str;
    }
}
