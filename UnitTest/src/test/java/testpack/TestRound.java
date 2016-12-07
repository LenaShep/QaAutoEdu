package testpack;

import figur.Round;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by shepelevich on 11/29/2016.
 */

public class TestRound {
    public static Round round;

    @BeforeClass
    public static void CreateRoundInstance() {
        round = new Round(2, 3, 5);
    }

    @Before
    public void setupStartCondition() {
        round.radius = 5;
    }

    @Test
    public void checkAreaCalculation() {
        round.area();
        round.area();
        Assert.assertTrue("Expected area is 15.707963267948966, and actual result is " + round.area, round.area == 15.707963267948966);
    }

    @Test
    public void checkChangeSizeWithIntKoef() {
        round.changeSize(2);
        round.area();
        Assert.assertEquals(31.415926535, round.area, 0.00001);
    }

    @Test
    public void checkChangeSizeWithDoubleKoef() {
        round.changeSize(0.55);
        round.area();
        Assert.assertEquals(8.63937979737, round.area, 0.00001);
    }

    @Test
    public void checkChangeSizeWithBigKoef() {
        round.changeSize(4684584);
        round.area();
        Assert.assertEquals(73585273.3976, round.area, 0.0001);
    }

}
