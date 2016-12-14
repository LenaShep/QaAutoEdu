package figur;

/**
 * Created by shepelevich on 11/19/2016.
 */
public class Round extends Figure {
    public double radius;


    public Round(float x, float y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double area() {
        area = Math.PI * radius;

        return 0;
    }

    public void changeSize(double koef) {
        radius = radius * koef;
    }


}
