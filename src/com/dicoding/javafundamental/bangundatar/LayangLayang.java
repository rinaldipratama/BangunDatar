package com.dicoding.javafundamental.bangundatar;

public class LayangLayang implements BangunDatar {

    LayangLayang(){}

    @Override
    public double luas(double d1, double d2) {
        return (d1 * d2 / 2);
    }

    @Override
    public double keliling(double ab, double bc) {
        return (2 * (ab + bc));
    }
}
