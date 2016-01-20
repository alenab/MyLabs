package module5.task3;

public class MatrixCalculator {

    public static int[][] matrixSum(int[][] matrixA, int[][] matrixB) {

        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            throw new IllegalStateException("It is impossible to find the sum of the matrices! The matrices must have " +
                    "the same dimension");
        }
        int[][] matrixC = new int[matrixA.length][matrixA[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int k = 0; k < matrixA[i].length; k++) {
                matrixC[i][k] = matrixA[i][k] + matrixB[i][k];
            }
        }
        return matrixC;
    }

    public static int[][] matrixMultiplication(int[][] matrixK, int[][] matrixL) {

        if (matrixK[0].length != matrixL.length) {
            throw new IllegalStateException("It is impossible to multiply the matrices! The number of columns of " +
                    "the first matrix must be equal to the number of rows of the second ");
        }

        int[][] matrixD = new int[matrixK.length][matrixL[0].length];

        for (int row = 0; row < matrixD.length; row++) {
            for (int column = 0; column < matrixD[row].length; column++) {
                int sum = 0;
                for (int m = 0; m < matrixL.length; m++) {
                    sum += matrixK[row][m] * matrixL[m][column];
                }
                matrixD[row][column] = sum;
            }
        }
        return matrixD;
    }

    public static void main(String[] args) {

        try {
            int matrixA[][] = {
                    {1, 3},
                    {1, 4},
            };
            System.out.println("matrixA" + "\t" );
            matrixPrintln(matrixA);
            int matrixB[][] = {
                    {0, 3},
                    {1, 3},
            };
            System.out.println("matrixB" + "\t" );
            matrixPrintln(matrixB);
            int[][] matrixC = matrixSum(matrixA, matrixB);
            System.out.println("matrixA+matrixB=matrixC ");
            matrixPrintln(matrixC);

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            int matrixK[][] = {
                    {1, 3},
                    {1, 4},
                    {2, 0},
            };
            System.out.println("matrixK" + "\t" );
            matrixPrintln(matrixK);
            int matrixL[][] = {
                    {0, 3, 4, 1},
                    {1, 3, 0, 2},
            };
            System.out.println("matrixL" + "\t" );
            matrixPrintln(matrixL);
            int[][] matrixD = matrixMultiplication(matrixK, matrixL);
            System.out.println("matrixK*matrixL=matrixD ");
            matrixPrintln(matrixD);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void matrixPrintln(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.printf("%d\t", matrix[row][column]);
            }
            System.out.println();
        }
    }
}


