package figur;

/**
 * Created by shepelevich on 11/19/2016.
 */
public class Square extends Figure {
    public double side;


    public Square(float x, float y, double side) {
        super(x, y);
        this.side = side;
    }

    public void area() {
        area = side * side;
    }

    public void changeSize(double koef) {

        side = side * koef;
    }
}
