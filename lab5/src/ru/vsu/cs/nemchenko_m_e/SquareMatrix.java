package ru.vsu.cs.nemchenko_m_e;

public class SquareMatrix implements Matrix {
    protected double[][] data;

    public SquareMatrix(double[][] rows) {
        int n = rows.length;
        int m = rows[0].length;
        this.data = new double[n][m];

        for (int i = 0; i < n; i++) {
            System.arraycopy(rows[i], 0, this.data[i], 0, m);
        }
    }

    @Override
    public double determinant() {
        return calculateDeterminant(data);
    }

    private double calculateDeterminant(double[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        }
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        double det = 0;
        for (int i = 0; i < n; i++) {
            det += (i % 2 == 0 ? 1 : -1) * matrix[0][i] * calculateDeterminant(getMinor(matrix, 0, i));
        }
        return det;
    }

    private double[][] getMinor(double[][] matrix, int row, int col) {
        int n = matrix.length;
        double[][] minor = new double[n - 1][n - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != row && j != col) {
                    minor[i < row ? i : i - 1][j < col ? j : j - 1] = matrix[i][j];
                }
            }
        }
        return minor;
    }

    @Override
    public Matrix add(Matrix other) {
        if (!(other instanceof SquareMatrix otherMatrix)) {
            throw new IllegalArgumentException("Матрицы должны быть одного типа для сложения.");
        }
        int n = data.length;
        double[][] result = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = this.data[i][j] + otherMatrix.data[i][j];
            }
        }
        return new SquareMatrix(result);
    }

    @Override
    public Matrix multiply(Matrix other) {
        if (!(other instanceof SquareMatrix otherMatrix)) {
            throw new IllegalArgumentException("Матрицы должны быть одного типа для умножения.");
        }
        int n = data.length;
        double[][] result = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    result[i][j] += this.data[i][k] * otherMatrix.data[k][j];
                }
            }
        }
        return new SquareMatrix(result);
    }

    @Override
    public Matrix transpose() {
        int n = data.length;
        int m = data[0].length;
        double[][] result = new double[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[j][i] = this.data[i][j];
            }
        }
        return new SquareMatrix(result);
    }

    @Override
    public Matrix inverse() {
        double det = determinant();
        if (det == 0) {
            throw new IllegalArgumentException("Матрица сингулярна и не может быть инвертирована.");
        }
        return calculateInverse(data);
    }

    private Matrix calculateInverse(double[][] matrix) {
        int n = matrix.length;
        double[][] inverse = new double[n][n];
        double det = determinant();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverse[j][i] = ((i + j) % 2 == 0 ? 1 : -1) * calculateDeterminant(getMinor(matrix, i, j)) / det;
            }
        }
        return new SquareMatrix(inverse);
    }
}







