package calculator;

import static java.lang.Math.*;

/**
 * Created by shepelevich on 11/14/2016.
 */
public class Arithmetic {
    public int arrayMultiplication(int[] massiv) {
        int length = massiv.length;
        int calculateMultiplication = 1;
        for (int i = 0; i < length; i++) {
            calculateMultiplication = calculateMultiplication * massiv[i];
        }
        return calculateMultiplication;
    }

    public double power(int b, int c) {
        double calculatePower = pow(b, c);
        return calculatePower;
    }

    public double division(double d, double e) {
        double calculateDivision = d / e;
        return calculateDivision;
    }

    public double root(int f) {
        double calculateRoot = sqrt(f);
        return calculateRoot;
    }
}
