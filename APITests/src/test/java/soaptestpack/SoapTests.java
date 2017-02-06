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


    @BeforeClass
    public static void createService() {
        service = new SpellService();
        port = service.getSpellServiceSoap();
    }

    @Before
    public void prepareCleanRequest() {
        request = new CheckTextRequest();
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
        Assert.assertTrue(listErrors.get(0).getPos() == 10);
        Assert.assertTrue(listErrors.get(0).getRow() == 0);
    }

    @Test
    public void checkPosAndRowAreCorrectForPhraseNotInARow() {
        request.setText("я \n любмю \n лето");
        CheckTextResponse checkTextResponse = port.checkText(request);
        List<SpellError> listErrors = checkTextResponse.getSpellResult().getError();
        Assert.assertTrue(listErrors.get(0).getRow() == 1);
    }

    @Test
    public void checkThatReplacementForSYGRANA() {
        request.setText("Пьеса была сиграна");
        CheckTextResponse checkTextResponse = port.checkText(request);
        List<SpellError> listErrors = checkTextResponse.getSpellResult().getError();
        Assert.assertTrue(listErrors.size() == 1);
        Assert.assertTrue(listErrors.get(0).getWord().equals("сиграна"));

    }

    @Test
    public void checkNumberOfReplacements() {
        request.setText("сиграна");
        CheckTextResponse checkTextResponse = port.checkText(request);
        List<SpellError> listErrors = checkTextResponse.getSpellResult().getError();
        Assert.assertTrue(listErrors.get(0).getS().size() == 5);
    }
}
