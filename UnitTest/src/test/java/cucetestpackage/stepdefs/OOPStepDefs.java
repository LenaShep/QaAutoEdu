package cucetestpackage.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import figur.Round;
import figur.Square;
import org.junit.Assert;

/**
 * Created by shepelevich on 12/13/2016.
 */
public class OOPStepDefs {

    int radius;
    double side;
    double koef;
    Round round = new Round(2, 3, 0);
    Square square = new Square(2, 3, 0.0);

    @Given("^I have radius (\\d+)$")
    public void iHaveRadius(int radius) throws Throwable {
        round.radius = radius;
    }

    @When("^calculate area for the round$")
    public void calculateAreaForTheRound() throws Throwable {
        round.area();
    }

    @And("^I have koef \"([^\"]*)\"$")
    public void iHaveKoef(String koef) throws Throwable {
        this.koef = Double.valueOf(koef);
    }

    @When("^change size of the radius$")
    public void changeSizeOfTheRadius() throws Throwable {
        round.changeSize(koef);
    }

    @Then("^Area is \"([^\"]*)\"$")
    public void areaIs(String expectedForRound) throws Throwable {
        Assert.assertTrue(round.area == Double.valueOf(expectedForRound));
    }

    @Given("^I have side \"([^\"]*)\"$")
    public void iHaveSide(String side) throws Throwable {
        square.side = Double.valueOf(side);
    }

    @When("^calculate area for the square$")
    public void calculateAreaForTheSquare() throws Throwable {
        square.area();
    }

    @Then("^Area for square is \"([^\"]*)\"$")
    public void areaForSquareIs(String expectedForSquare) throws Throwable {
        Assert.assertTrue(square.area == Double.valueOf(expectedForSquare));
    }

    @Then("^area of the square is not null$")
    public void areaOfTheSquareIsNotNull() throws Throwable {
        Assert.assertNotNull(square.area);
    }

    @When("^change side size for square$")
    public void changeSideSizeForSquare() throws Throwable {
        square.changeSize(koef);
    }
}
