package ru.vsu.cs.nemchenko_m_e;

public class IdentityMatrix extends SquareMatrix {

    public IdentityMatrix(int size) {
        super(new double[size][size]);
        for (int i = 0; i < size; i++) {
            data[i][i] = 1;
        }
    }
}


