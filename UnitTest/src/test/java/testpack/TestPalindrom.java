package testpack;

import games.Palindrom;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by shepelevich on 11/30/2016.
 */
public class TestPalindrom {

    @Test
    public void checkThatReturnTrueForWordIsPalindrom() {
        String word = "потоп";
        Assert.assertTrue(Palindrom.checkWord(word) == true);

    }

    @Test
    public void checkThatReturnFalseForWordIsNotPalindrom() {
        String word = "песня";
        Assert.assertFalse(Palindrom.checkWord(word) == true);

    }

    @Test
    public void checkTahtCaseIgnoredinPalindromWord(){
        String word = "АнНа";
        Assert.assertTrue(Palindrom.checkWord(word) == true);
    }

    @Test
    public void checkThatSpacesIgnoredInPalindromPhrase(){
        String phrase = "Яд ем как мед я";
        Assert.assertTrue(Palindrom.checkPhrase(phrase) == true);
    }

    @Test
    public void checkThatPhraseWithCommaIsNotPalindrom(){
    String phrase = "Иди, Сеня, не сиди";
        Assert.assertTrue(Palindrom.checkPhrase(phrase) == false);
    }

    @Test
    public void checkThatPhraseWithSeveralSpacesIsAlsoPalindrom (){
        String phrase="Аргентина                    манит               негра";
        Assert.assertTrue(Palindrom.checkPhrase(phrase)== true);
    }
}
