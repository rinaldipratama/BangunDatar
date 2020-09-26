package com.dicoding.javafundamental.bangundatar;

public class Trapesium implements BangunDatar {

    Trapesium() {}

    @Override
    public double luas(double s1, double s2) {
        return 0;
    }

    @Override
    public double keliling(double s1, double s2) {
        return 0;
    }

    public double luas(double a, double b, double s) {
        return ((a + b) * tinggi(a, b, s) / 2);
    }

    public double keliling(double a, double b, double s) {
        return (a + b + s + tinggi(a, b, s));
    }

    public double tinggi(double a, double b, double s) {
        return (Math.sqrt(s * s - ((b - a) * (b - a))));
    }
}
