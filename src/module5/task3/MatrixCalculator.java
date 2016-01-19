package module5.task3;

public class MatrixCalculator {

    public static int[][] matrixSum(int[][] matrixA, int[][] matrixB) {

        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            throw new IllegalStateException("It is impossible to find the sum of the matrices! The matrices must have " +
                    "the same dimension");
        }
        int[][] matrixC = new int[matrixA.length][matrixA[0].length];

        for (int i = 0; i < 2; i++) { // меджик намбер - 2
            for (int k = 0; k < 2; k++) {
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

        for (int row = 0; row < matrixD.length; row++) { // в жизни тройной цикл - это жесть)) для перформанса. Даже двойной желательно избегать.
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
            int matrixB[][] = {
                    {0, 3},
                    {1, 3},
            };
            int[][] matrixC = matrixSum(matrixA, matrixB);
            System.out.println("matrixA+matrixB=matrixC ");
            for (int row = 0; row < matrixC.length; row++) {// было бы неплохо, чтобы ты наглядно выводила исходные две матрицы
                //а потом уже результирующую.
                for (int column = 0; column < matrixC[row].length; column++) {
                    System.out.print(matrixC[row][column] + "\t");
                }
                System.out.println();
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {// а можно описать, объяснить, как перемножаются две матрицы с разной размерностью строк и колонок?
            //какой принцип?
            int matrixK[][] = {
                    {1, 3},
                    {1, 4},
                    {2, 0},
            };
            int matrixL[][] = {
                    {0, 3, 4, 1},
                    {1, 3, 0, 2},
            };

            int[][] matrixD = matrixMultiplication(matrixK, matrixL);
            System.out.println("matrixK*matrixL=matrixD ");

            for (int printRow = 0; printRow < matrixD.length; printRow++) {
                for (int printColumn = 0; printColumn < matrixD[printRow].length; printColumn++) {
                    System.out.printf("%d\t", matrixD[printRow][printColumn]);
                }
                System.out.println();
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

    }
}

