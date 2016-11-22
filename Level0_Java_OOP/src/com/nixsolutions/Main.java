package com.nixsolutions;

import figur.Figure;
import figur.Round;
import figur.Square;
import figur.Triangle;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Figure[] massivFigure = new Figure[10];

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(3);
            switch (randomNumber) {
                case 0:
                    massivFigure[i] = new Round(1, 5, random.nextInt(100) + 1);
                    break;
                case 1:
                    massivFigure[i] = new Square(1, 3, random.nextInt(100) + 1);
                    break;
                case 2:
                    while (true) {
                        double a1 = random.nextInt(100) + 1;
                        double b1 = random.nextInt(100) + 1;
                        double c1 = random.nextInt(100) + 1;

                        if (a1 + b1 > c1 && a1 + c1 > b1 && b1 + c1 > a1) {
                            massivFigure[i] = new Triangle(1, 3, a1, b1, c1);
                            break;
                        }

                    }

            }
        }
        for (int i = 0; i < 10; i++) {
            massivFigure[i].area();
            System.out.println(massivFigure[i].getClass().getName() + "\n" + "Первоначальная площадь фигуры = " + " " + massivFigure[i].area);
            massivFigure[i].changeSize(random.nextDouble());
            massivFigure[i].area();
            System.out.println("Измененная площадь фигуры = " + massivFigure[i].area);
        }
        System.out.println("\n" + "Сортировка:");
        for (int i = 10 - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (massivFigure[j].area < massivFigure[j + 1].area) {
                    double tmp = massivFigure[j].area;
                    massivFigure[j].area = massivFigure[j + 1].area;
                    massivFigure[j + 1].area = tmp;
                }
            }
            System.out.println(massivFigure[i].area );
        }
    }


}











