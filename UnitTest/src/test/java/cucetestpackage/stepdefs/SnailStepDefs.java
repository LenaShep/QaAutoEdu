package cucetestpackage.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import games.Snail;
import org.junit.Assert;

/**
 * Created by shepelevich on 12/12/2016.
 */
public class SnailStepDefs {
    int matrixsize;
    int[][] matrix;
    int max = 0;

    @Given("^size of matrix snail is (\\d+)$")
    public void sizeOfMatrixSnailIs(int matrixsize) throws Throwable {
        this.matrixsize = matrixsize;
    }

    @When("^create matrix$")
    public void createMatrix() throws Throwable {
        matrix = Snail.calculateSnail(matrixsize);
    }

    @And("^find last element$")
    public void findLastElement() throws Throwable {
        for (int i = 0; i < matrixsize; i++) {
            for (int j = 0; j < matrixsize; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
    }


    @Then("^last element is on the left bottom corner$")
    public void checkThatLastElementIsOnTheProperPlace() throws Throwable {
        if (matrixsize % 2 == 0) {
            System.out.println(matrix[matrixsize - 1][0]);
            Assert.assertTrue(matrix[matrixsize - 1][0] == max);
        } else {
            System.out.println(matrix[0][matrixsize - 1]);
            Assert.assertTrue(matrix[0][matrixsize - 1] == max);
        }
    }


    @Then("^check that first element is (\\d+)$")
    public void checkThatFirstElementIs(int result) throws Throwable {
        int firstElement = 0;
        if (matrixsize % 2 == 0) {
            firstElement = (matrixsize - 2) / 2;
            Assert.assertTrue(matrix[firstElement][firstElement] == result);
        } else {
            firstElement = (matrixsize - 2) / 2 + 1;
            Assert.assertTrue(matrix[firstElement][firstElement] == result);
        }
    }

    @Then("^check that element in matrix column (\\d+), row (\\d+) is (\\d+)$")
    public void checkThatElementInMatrixColumnRowIs(int column, int row, int number) throws Throwable {
        Assert.assertEquals(number, matrix[row - 1][column - 1]);
    }
}

