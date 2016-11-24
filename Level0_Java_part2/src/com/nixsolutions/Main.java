package com.nixsolutions;

import calculator.Arithmetic;
import games.Matrix;
import games.Palindrom;
import games.Snail;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static String readInfo() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rnum = reader.readLine();
        return rnum;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Пожалуйста, введите цифру блока, который хотите использовать:" + "\n" + "1. Формирование матрицы" + "\n" + "2. Арифметические действия" + "\n" + "3. Улитка" + "\n" + "4. Проверка, является ли палиндромом" + "\n" + "Для ВЫХОДА введите Exit");
        String menu = reader.readLine();
        while (!menu.equals("Exit")) {
            int nummenu = Integer.parseInt(menu);
            switch (nummenu) {
                case 1:
                    System.out.println("Введите, пожалуйста, целое число от 1 до 9.");
                    String numberMatrix = readInfo();
                    while (!(numberMatrix.equals("X"))) {
                        int number = Integer.parseInt(numberMatrix);
                        if (number <= 9 && number >= 1) {
                            Matrix mat = new Matrix();
                            mat.matrix(number);
                            System.out.println("Если желаете повторить, введите число снова. Если же хотите вернуться на главное меню, введите Х.");
                        } else {
                            System.out.println("Число должно быть от 1 до 9. Попробуйте снова!");
                            System.out.println("Если же Вы хотите выйти из программы, введите X.");
                        }
                        numberMatrix = readInfo();
                    }
                    break;
                case 2:
                    Arithmetic arithmetic = new Arithmetic();
                    System.out.println("Введите, пожалуйста, длину массива чисел, которые Вы хотите перемножить.");
                    String readLength = reader.readLine();
                    int massivLength = Integer.parseInt(readLength);
                    System.out.println("Введите, пожалуйста, числа массива (целые числа), которые хотите перемножить.");
                    int[] massiv = new int[massivLength];

                    for (int i = 0; i < massivLength; i++) {
                        String readNumberForMultiplication = reader.readLine();
                        massiv[i] = Integer.parseInt(readNumberForMultiplication);
                    }
                    int multiplicationResult = arithmetic.arrayMultiplication(massiv);
                    System.out.println("Результат = " + multiplicationResult);

                    System.out.println("Введите, пожалуйста, число и степень для него (целые числа).");
                    String readNumberForPower1 = reader.readLine();
                    String readNumberForPower2 = reader.readLine();
                    int numberPower1 = Integer.parseInt(readNumberForPower1);
                    int numberPower2 = Integer.parseInt(readNumberForPower2);
                    double powerResult = arithmetic.power(numberPower1, numberPower2);
                    System.out.println("Результат = " + powerResult);

                    System.out.println("Введите, пожалуйста, 2 числа, которые хотите поделить одно на другое (целые числа).");
                    String readNumberForDivision1 = reader.readLine();
                    String readNumberForDivision2 = reader.readLine();
                    int numberDivision1 = Integer.parseInt(readNumberForDivision1);
                    int numberDivision2 = Integer.parseInt(readNumberForDivision2);
                    double divisionResult = arithmetic.division(numberDivision1, numberDivision2);
                    System.out.println("Результат = " + divisionResult);

                    System.out.println("Введите, пожалуйста, число, квадратный корень которого хотите вычислить (целые числа).");
                    String readNumberForRoot = reader.readLine();
                    int numberRoot = Integer.parseInt(readNumberForRoot);
                    double rootResult = arithmetic.root(numberRoot);
                    System.out.println("Результат = " + rootResult);
                    break;
                case 3:
                    Snail snail = new Snail();
                    System.out.println("Введите, пожалуйста, целое число равное или больше 3.");
                    String readNumberForSnail = reader.readLine();
                    int numberSnail = Integer.parseInt(readNumberForSnail);

                    if (numberSnail >= 3) {
                        snail.calculateSnail(numberSnail);
                    }
                    break;
                case 4:
                    Palindrom palindrom = new Palindrom();
                    System.out.println("Введи слово, которое хотите проверить.");
                    String word = reader.readLine();
                    boolean checkPalindromWord = palindrom.checkWord(word);
                    if (checkPalindromWord == true) {
                        System.out.println("Слово <" + word + "> является палиндромом.");
                    } else {
                        System.out.println("Слово <" + word + "> не является палиндромом.");
                    }
                    System.out.println("Введи предложение, которое хотите проверить.");
                    String phrase = reader.readLine();
                    boolean checkPalindromPhrase = palindrom.checkPhrase(phrase);
                    if (checkPalindromPhrase == true) {
                        System.out.println("Фраза <" + phrase + "> является палиндромом.");
                    } else {
                        System.out.println("Фраза <" + phrase + "> не является палиндромом.");
                    }
                    break;
            }
            System.out.println("Желаете выбрать другой блок:" + "\n" + "1. Формирование матрицы" + "\n" + "2. Арифметические действия" + "\n" + "3. Улитка" + "\n" + "4. Проверка, является ли палиндромом" + "\n" + "Для ВЫХОДА введите Exit");
            String menuNew = reader.readLine();
            menu = menuNew;


        }

    }


}



