package testpack;

import figur.Round;
import figur.Square;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shepelevich on 11/30/2016.
 */
public class TestSquare {

    @Test
    public void checkAreaCalculationWithIntSide(){
        Square square=new Square(5, 2, 5);
        square.area();
        Assert.assertTrue(square.area==25);

    }

    @Test
    public void checkAreaCalculationWithDoubleSide(){
        Square square=new Square(5, 2, 8.55);
        square.area();
        Assert.assertTrue(square.area==73.1025);

    }

    @Test
    public void checkSquareChangeSizeWithIntKoef(){
        Square square=new Square(5, 2, 9);
        square.changeSize(3);
        square.area();
        Assert.assertTrue(square.area==729);

    }

    @Test
    public void checkSquareChangeSizeWithDoubleKoef(){
        Square square=new Square(5, 2, 9);
        square.changeSize(3.55);
        square.area();
        Assert.assertTrue(square.area==1020.8025);

    }

    @Test
    public void checkThatAreaSquareIsNotNull(){
        Square square=new Square(5, 2, 5);
        square.area();
        Assert.assertNotNull(square.area);
    }
}
