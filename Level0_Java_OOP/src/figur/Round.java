package figur;

/**
 * Created by shepelevich on 11/19/2016.
 */
public class Round extends Figure {
    private double radius;


    public Round(float x, float y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public void area() {
        area = Math.PI * radius;

    }

    public void changeSize(double koef) {
        radius = radius * koef;
    }


}
