package games;

/**
 * Created by shepelevich on 11/14/2016.
 */
public class Snail {
    public static int[][] calculateSnail(int size) {
        int firstElement = 0;
        if (size % 2 == 0) {
            firstElement = (size - 2) / 2;
        } else {
            firstElement = (size - 2) / 2 + 1;
        }
        int i = firstElement;
        int j = firstElement;
        int minI = firstElement, maxI = firstElement, minJ = firstElement, maxJ = firstElement;
        int d = 0;
        int[][] mas = new int[size][size];
        for (int k = 1; k <= size * size; k++) {
            mas[i][j] = k;
            switch (d) {
                case 0:
                    j = j + 1;
                    if (j > maxJ) {
                        d = 1;
                        maxJ = j;
                    }
                    break;
                case 1:
                    i += 1;
                    if (i > maxI) {
                        d = 2;
                        maxI = i;
                    }
                    break;

                case 2:
                    j -= 1;
                    if (j < minJ) {
                        d = 3;
                        minJ = j;
                    }
                    break;
                case 3:
                    i -= 1;
                    if (i < minI) {
                        d = 0;
                        minI = i;
                    }
                    break;
            }
        }
        for (int i1 = 0; i1 < size; i1++) {
            for (int j1 = 0; j1 < size; j1++) {
                System.out.print(mas[i1][j1] + "\t");
            }
            System.out.println();
        }
        return mas;
    }

}






