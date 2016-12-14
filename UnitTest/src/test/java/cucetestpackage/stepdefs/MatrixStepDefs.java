package cucetestpackage.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import games.Matrix;
import org.junit.Assert;

/**
 * Created by shepelevich on 12/9/2016.
 */
public class MatrixStepDefs {
    int matrixSize;
    int[][] actual;

    @Given("^I have set matrix size as (\\d+)$")
    public void iHaveSetMatrixSizeAs(int matrixSize) throws Throwable {
        this.matrixSize = matrixSize;
    }

    @When("^I run method which creates matrix$")
    public void iRunMethodWhichCreatesMatrix() throws Throwable {
        actual = Matrix.matrix(matrixSize);
    }

    @Then("^Matrix created with (\\d+) elements in line/column$")
    public void matrixCreatedWithElementsInLineColumn(int arg0) throws Throwable {
        int[][] expected = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 1, 2, 3}, {4, 5, 6, 7}};
        Assert.assertArrayEquals(actual, expected);
    }

    @Then("^Matrix elements are no more than (\\d+)$")
    public void matrixElementsAreNoMoreThan(int element) throws Throwable {
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                Assert.assertFalse("Matrix element greater than 9", actual[i][j] > 9);
            }
        }
    }

    @Then("^Matrix elements are no less than (\\d+)$")
    public void matrixElementsAreNoLessThan(int arg0) throws Throwable {
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                Assert.assertFalse("Matrix element less than 1", actual[i][j] < 1);
            }
        }
    }
}

