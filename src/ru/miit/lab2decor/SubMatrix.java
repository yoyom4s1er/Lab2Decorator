package ru.miit.lab2decor;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

@Decorator
public class SubMatrix implements IMatrixOperation{

    @Inject
    @Delegate
    @Default
    private IMatrixOperation iMatrixOperation;

    private int[][] matrix = {  {1,1,1},
                                {1,1,1},
                                {1,1,1} };

    @Override
    public int[][] operate(int[][] matrix1, int[][] matrix2) {
        int[][] resultMatrix = iMatrixOperation.operate(matrix1, matrix2);
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                resultMatrix[i][j] -= matrix[i][j];
            }
        }
        return resultMatrix;
    }
}
