package ru.vsu.cs.nemchenko_m_e;

public class DiagonalMatrix extends SquareMatrix {

    public DiagonalMatrix(double[] diagonalValues) {
        super(new double[diagonalValues.length][diagonalValues.length]);
        for (int i = 0; i < diagonalValues.length; i++) {
            data[i][i] = diagonalValues[i];
        }
    }
}


