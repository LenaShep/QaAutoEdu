package figur;

/**
 * Created by shepelevich on 11/19/2016.
 */
public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;


    public Triangle(float x, float y, double a, double b, double c) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void area() {
        double p = (a + b + c) / 2;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void changeSize(double koef) {
        a = a * koef;
        b = b * koef;
        c = c * koef;

    }
}
