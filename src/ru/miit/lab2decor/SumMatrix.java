package ru.miit.lab2decor;

import javax.enterprise.inject.Default;

@Default
public class SumMatrix implements IMatrixOperation{

    @Override
    public int[][] operate(int[][] matrix1, int[][] matrix2) {
        int[][] resultMatrix = MatrixUtil.clone(matrix1);
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                resultMatrix[i][j] += matrix2[i][j];
            }
        }
        return resultMatrix;
    }
}
