package com.dicoding.javafundamental.bangundatar;

public class BelahKetupat implements BangunDatar {

    BelahKetupat() {}

    @Override
    public double luas(double d1, double d2) {
        return (d1 * d2 / 2);
    }

    @Override
    public double keliling(double d1, double d2) {
        return (4 * sisiMiring(d1, d2));
    }

    public double sisiMiring(double d1, double d2) {
        return (Math.sqrt(((d1 / 2) * (d1 / 2)) + ((d2 / 2) * (d2 / 2))));
    }
}
