package ru.vsu.cs.nemchenko_m_e;

public interface Matrix {
    Matrix add(Matrix other);
    Matrix multiply(Matrix other);
    Matrix transpose();
    Matrix inverse();
    double determinant();;
}
