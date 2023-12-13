package ru.miit.lab2decor;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import java.util.Arrays;

public class Lab2Start {
    protected static Weld weld;
    protected static WeldContainer container;

    public static void main(String args[]) throws Exception {
        weld = new Weld();
        container = weld.initialize();

        try {
            int[][] matrix1 = { {1,2,3},
                                {4,5,6},
                                {7,8,9} };
            int[][] matrix2 = { {1,2,3},
                                {4,5,6},
                                {7,8,9} };

            MatrixOperationBean matrixOperationBean = container.instance().select(MatrixOperationBean.class).get();
            int[][] result = matrixOperationBean.operate(matrix1, matrix2);

            for (int[] stroka: result) {
                System.out.println(Arrays.toString(stroka));
            }
        } finally {
            weld.shutdown();
        }
    }
}
