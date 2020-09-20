package algorithms;

import java.util.Random;

public class Task_02 {

    private static int[][] matrix;

    public Task_02() {
        GenerateMatrix();
    }

    public void GenerateMatrix() {
        Random random = new Random();
        matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
    }

    private int GetNumberOfMainDiagonal() {
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

    public String OutputNumberOfMainDiagonal() {
        return "Наибольшее число главной диагонали: " + GetNumberOfMainDiagonal();
    }

    private int SumRows(int indexRow) {
        int sumRow = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumRow += matrix[indexRow][i];
        }
        return sumRow;
    }

    private int MulColumns(int indexColumns) {
        int mulCol = 1;
        for (int i = 0; i < matrix.length; i++) {
            mulCol *= matrix[i][indexColumns];
        }
        return mulCol;
    }

    public String OutputSumRows() {
        String str = "";
        for (int i = 0; i < matrix.length; i++) {
            str += "Row(" + i + ") -> Sum(" + SumRows(i) + ");\n";
        }
        return str;
    }
    public String OutputMulColumns() {
        String str = "";
        for (int i = 0; i < matrix.length; i++) {
            str += "Col(" + i + ") -> Mul(" + MulColumns(i) + ");\n";
        }
        return str;
    }

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
