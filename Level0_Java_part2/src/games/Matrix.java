package games;


/**
 * Created by shepelevich on 11/14/2016.
 */
public class Matrix {
    public static void matrix(int matrixSize) {
        int[][] matrix = new int[matrixSize][matrixSize];
        int k = 1;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = k;
                System.out.print(matrix[i][j] + " ");
                if (k < 9) {
                    k++;
                } else k = 1;
            }
            System.out.println();
        }
    }
}



