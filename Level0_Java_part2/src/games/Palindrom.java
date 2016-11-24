package games;

import java.awt.*;

/**
 * Created by shepelevich on 11/17/2016.
 */
public class Palindrom {
    StringBuilder builder = new StringBuilder();

    public boolean checkWord(String someWord) {
        StringBuilder builder = new StringBuilder(someWord);
        StringBuilder reverseWord = builder.reverse();
        return someWord.equalsIgnoreCase(String.valueOf(reverseWord));
    }

    public boolean checkPhrase(String somePhrase) {
        String phraseWithoutSpaces = somePhrase.replace(" ", "");
        StringBuilder builder = new StringBuilder(phraseWithoutSpaces);
        StringBuilder reversePhrase = builder.reverse();
       return phraseWithoutSpaces.equalsIgnoreCase(String.valueOf(reversePhrase));
    }
}

