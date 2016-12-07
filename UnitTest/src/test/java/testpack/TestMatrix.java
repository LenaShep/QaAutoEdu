package testpack;

import games.Matrix;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.internal.builders.NullBuilder;

import java.util.Arrays;

/**
 * Created by shepelevich on 11/29/2016.
 */
public class TestMatrix {

    @Test
    public void checkMatrixCreation() {
        int matrixSize = 4;
        int[][] actual = Matrix.matrix(matrixSize);
        int[][] expected = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 1, 2, 3}, {4, 5, 6, 7}};
        Assert.assertArrayEquals(actual, expected);
    }


    @Test
    public void checkThatMatrixNumbersNoGreaterThan9() {
        int matrixSize = 5;
        int[][] result = Matrix.matrix(matrixSize);
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                Assert.assertFalse("Matrix element greater than 9", result[i][j] > 9);
            }
        }

    }

    @Test
    public void checkThatMatrixNumbersNoLessThan1() {
        int matrixSize = 15;
        int[][] result = Matrix.matrix(matrixSize);
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                Assert.assertFalse("Matrix element less than 1", result[i][j] < 1 );
            }
        }

    }


}





