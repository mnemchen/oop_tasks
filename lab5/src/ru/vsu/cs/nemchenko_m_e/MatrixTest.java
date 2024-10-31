package ru.vsu.cs.nemchenko_m_e;

public class MatrixTest {
    public static void main(String[] args) {
        SquareMatrix matrixA = new SquareMatrix(new double[][]{
                {1, 2},
                {3, 4}
        });

        SquareMatrix matrixB = new SquareMatrix(new double[][]{
                {5, 6},
                {7, 8}
        });

        double determinant = matrixA.determinant();
        System.out.printf("Определитель матрицы A: %s%n", determinant);

        IdentityMatrix identity = new IdentityMatrix(2);
        System.out.println("Единичная матрица:");
        printMatrix(identity);

        DiagonalMatrix diagonalMatrix = new DiagonalMatrix(new double[]{1, 2, 3});
        System.out.println("Диагональная матрица:");
        printMatrix(diagonalMatrix);

        Matrix sum = matrixA.add(matrixB);
        System.out.println("Сумма матриц: ");
        printMatrix(sum);

        Matrix product = matrixA.multiply(matrixB);
        System.out.println("Произведение матриц:");
        printMatrix(product);

        Matrix transposed = matrixA.transpose();
        System.out.println("Транспонированная матрица:");
        printMatrix(transposed);

        Matrix inverse = matrixA.inverse();
        System.out.println("Обратная матрица A:");
        printMatrix(inverse);
    }

    private static void printMatrix(Matrix matrix) {
        if (matrix instanceof SquareMatrix squareMatrix) {
            for (double[] row : squareMatrix.data) {
                for (double value : row) {
                    System.out.printf("%s ", value);
                }
                System.out.println();
            }
        }
    }
}






