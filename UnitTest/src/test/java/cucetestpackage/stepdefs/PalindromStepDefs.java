package cucetestpackage.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import games.Palindrom;
import org.junit.Assert;
import org.omg.CORBA.portable.Streamable;

/**
 * Created by shepelevich on 12/12/2016.
 */
public class PalindromStepDefs {
    String word;
    String phrase;

    @Given("^I have work \"([^\"]*)\"$")
    public void iHaveWork(String word) throws Throwable {
        this.word = word;
    }

    @Then("^Word is palindrom$")
    public void wordIsPalindrom() throws Throwable {
        Assert.assertTrue(Palindrom.checkWord(word));
    }

    @Given("^I have word \"([^\"]*)\"$")
    public void iHaveWord(String word) throws Throwable {
        this.word = word;
    }

    @Then("^Word is not palindrom$")
    public void wordIsNotPalindrom() throws Throwable {
        Assert.assertFalse(Palindrom.checkWord(word));
    }

    @Given("^I have phrase \"([^\"]*)\"$")
    public void iHavePhrase(String phrase) throws Throwable {
        this.phrase = phrase;
    }

    @Then("^Phrase is palindrom$")
    public void phraseIsPalindrom() throws Throwable {
        Assert.assertTrue(Palindrom.checkPhrase(phrase));
    }

    @Then("^Phrase is not palindrom$")
    public void phraseIsNotPalindrom() throws Throwable {
        Assert.assertTrue(Palindrom.checkPhrase(phrase) == false);
    }
}
