package testpack;

import games.Snail;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by shepelevich on 11/29/2016.
 */
public class TestSnail {

    @Test
    public void CheckThatSnailPowSizeEqualsToMaxElement() {
        int matrixSize = 8;
        int max = 0;
        int[][] matrix = Snail.calculateSnail(matrixSize);
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        Assert.assertTrue(max == matrixSize * matrixSize);
    }


    @Test
    public void checkPositionOfLastElement() {//для четной размерности - левый нижний угол, для неченой - правый верхний
        int matrixSize = 80;
        int[][] matrix = Snail.calculateSnail(matrixSize);
        int max = 0;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        if (matrixSize % 2 == 0) {
            System.out.println(matrix[matrixSize-1][0]);
            Assert.assertTrue(matrix[matrixSize-1][0] == max);
        } else {
            System.out.println(matrix[0][matrixSize-1]);
            Assert.assertTrue(matrix[0][matrixSize-1] == max);
        }
    }

    @Test
    public void checkThatFirstElementEqualsTo1() {
        int matrixSize = 25;
        int firstElement = 0;
        int[][] matrix = Snail.calculateSnail(matrixSize);

        if (matrixSize % 2 == 0) {
            firstElement = (matrixSize - 2) / 2;
            Assert.assertTrue(matrix[firstElement][firstElement] == 1);
        } else {
            firstElement = (matrixSize - 2) / 2 + 1;
            Assert.assertTrue(matrix[firstElement][firstElement] == 1);
        }
    }

    @Test
    public void checkThatSpecifiqueElementIsCorrectNumber(){
        int matrixSize = 22;
        int[][] matrix = Snail.calculateSnail(matrixSize);
        Assert.assertEquals(209, matrix[5][3]);
    }

}
