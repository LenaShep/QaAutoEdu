package soaptestpack;

import net.yandex.speller.services.spellservice.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * Created by shepelevich on 2/1/2017.
 */
public class SoapTests {
    private static SpellService service;
    private static SpellServiceSoap port;
    private CheckTextRequest request;
    private ObjectFactory objectFactory;

    @BeforeClass
    public static void createService() {
        service = new SpellService();
        port = service.getSpellServiceSoap();
    }

    @Before
    public void prepareCleanRequest() {
        request = new CheckTextRequest();
        objectFactory = new ObjectFactory();
        request.setLang(("RU"));
    }

    @Test
    public void checkThatFor3WrongWordsAre3Errors() {
        request.setText("филм");
        CheckTextResponse checkTextResponse1 = port.checkText(request);
        request.setText("писня");
        CheckTextResponse checkTextResponse2 = port.checkText(request);
        request.setText("глоз");
        CheckTextResponse checkTextResponse3 = port.checkText(request);
        Assert.assertTrue(checkTextResponse1.getSpellResult().getError().size() + checkTextResponse2.getSpellResult().getError().size() + checkTextResponse3.getSpellResult().getError().size() == 3);
    }

    @Test
    public void checkPosAndRowAreCorrect() {
        request.setText("Все любят катиков");
        CheckTextResponse checkTextResponse = port.checkText(request);
        List<SpellError> listErrors = checkTextResponse.getSpellResult().getError();
        int pos = 0;
        int row = 0;
        for (SpellError error : listErrors) {
            pos = error.getPos();
            row = error.getRow();
        }
        Assert.assertTrue(pos == 10);
        Assert.assertTrue(row == 0);
    }

    @Test
    public void checkPosAndRowAreCorrectForPhraseNotInARow() {
        request.setText("я \n любмю \n лето");
        CheckTextResponse checkTextResponse = port.checkText(request);
        List<SpellError> listErrors = checkTextResponse.getSpellResult().getError();
        int row = 0;
        for (SpellError error : listErrors) {
            row = error.getRow();
        }
        Assert.assertTrue(row == 1);
    }

    @Test
    public void checkThatReplacementForSYGRANA() {
        request.setText("Пьеса была сиграна");
        CheckTextResponse checkTextResponse = port.checkText(request);
        List<SpellError> listErrors = checkTextResponse.getSpellResult().getError();
        Assert.assertTrue(listErrors.size() == 1);
        String word = null;
        for (SpellError error : listErrors) {
            word = error.getWord();
        }
        Assert.assertTrue(word.equals("сиграна"));

    }

    @Test
    public void checkNumberOfReplacements() {
        request.setText("сиграна");
        CheckTextResponse checkTextResponse = port.checkText(request);
        List<SpellError> listErrors = checkTextResponse.getSpellResult().getError();
        List<String> sList = null;
        for (SpellError error : listErrors) {
            sList = error.getS();
        }
        Assert.assertTrue(sList.size() == 5);
    }
}
