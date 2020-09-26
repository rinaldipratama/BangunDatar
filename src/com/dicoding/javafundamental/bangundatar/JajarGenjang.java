package com.dicoding.javafundamental.bangundatar;

public class JajarGenjang implements BangunDatar {

    JajarGenjang() {}

    @Override
    public double luas(double a, double t) {
        return (a * t);
    }

    @Override
    public double keliling(double a, double b) {
        return (2 * (a + sisiMiring(b)));
    }

    public double sisiMiring(double b) {
        return b;
    }
}
