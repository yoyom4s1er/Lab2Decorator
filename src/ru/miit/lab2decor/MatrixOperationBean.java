package ru.miit.lab2decor;

import javax.inject.Inject;

public class MatrixOperationBean {

    @Inject
    private IMatrixOperation iMatrixOperation;

    public int[][] operate(int[][] matrix1, int[][] matrix2) {
        return iMatrixOperation.operate(matrix1, matrix2);
    }
}
