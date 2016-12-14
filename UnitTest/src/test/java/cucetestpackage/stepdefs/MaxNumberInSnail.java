package cucetestpackage.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import games.Snail;
import org.junit.Assert;

/**
 * Created by shepelevich on 12/13/2016.
 */
public class MaxNumberInSnail {
    int matrixSize;
    int[][] matrix;
    int max = 0;

    @Given("^I select matrix size as \"([^\"]*)\"$")
    public void iSelectMatrixSizeAs(String size) throws Throwable {
        this.matrixSize = Integer.valueOf(size);
    }

    @When("^I run method which creates Snail matrix$")
    public void iRunMethodWhichCreatesSnailMatrix() throws Throwable {
        matrix = Snail.calculateSnail(matrixSize);
    }

    @And("^I find max element in the matrix snail$")
    public void iFindMaxElementInTheMatrixSnail() throws Throwable {
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
    }

    @Then("^Max element is equal to \"([^\"]*)\"$")
    public void maxElementIsEqualTo(String expected) throws Throwable {
        Assert.assertTrue(max == Integer.valueOf(expected));
    }
}
