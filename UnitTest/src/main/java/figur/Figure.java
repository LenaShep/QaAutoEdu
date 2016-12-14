package figur;

/**
 * Created by shepelevich on 11/19/2016.
 */
public abstract class Figure {
    public double x; // x-координата точки
    public double y; // y-координата точки
    public double area; //area-площадь фигуры

    public Figure(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public void moving(double x1, double y1) {
    x =x +x1;
    y =y +y1;
}
    public abstract double area();

    public abstract void changeSize(double koef);

}

