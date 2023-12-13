package ru.miit.lab2decor;

public class MatrixUtil {

    public static int[][] clone(int[][] matrix) {
        int[][] myInt = new int[matrix.length][];
        for(int i = 0; i < matrix.length; i++)
        {
            myInt[i] = new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++)
            {
                myInt[i][j] = matrix[i][j];
            }
        }

        return myInt;
    }
}
