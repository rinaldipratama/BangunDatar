package com.dicoding.javafundamental.bangundatar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /*Program*/
        //panggil metode
        mainMenu();
    }

    private static void mainMenu(){

        //pilihan menu
        System.out.println("=========================================");
        System.out.println("| Hitung Luas dan Keliling Bangun Datar |");
        System.out.println("=========================================");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga Siku-Siku");
        System.out.println("4. Jajar Genjang");
        System.out.println("5. Trapesium");
        System.out.println("6. Layang-Layang");
        System.out.println("7. Belah Ketupat");
        System.out.println("8. Lingkaran");
        System.out.println("9. Keluar\n");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);

        try {
            System.out.print("Masukan Pilihan Menu : ");
            String input = bufferedReader.readLine();

            //kondisional untuk pilihan menu yang dimasukan
            if (input.isEmpty()) {
                System.out.println("\nAnda tidak memasukkan inputan, silahkan coba lagi.\n");
                mainMenu();
            } else {
                int numberOfString = Integer.parseInt(input);

                if (numberOfString == 1) {
                    persegi();
                } else if (numberOfString == 2) {
                    persegiPanjang();
                } else if (numberOfString == 3) {
                    segitigaSiku();
                } else if (numberOfString == 4){
                    jajarGenjang();
                } else if (numberOfString == 5){
                    trapesium();
                } else if (numberOfString == 6){
                    layangLayang();
                } else if (numberOfString == 7){
                    belahKetupat();
                } else if (numberOfString == 8) {
                    lingkaran();
                } else if (numberOfString == 9) {
                    System.out.println("\nThank You For Using This Application.\n");
                } else {
                    System.out.println("\nTidak ada pilihan, silahkan coba lagi.\n");
                    mainMenu();
                }
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("\nTidak ada pilihan, silahkan coba lagi.\n");
            mainMenu();
        }
    }

    private static void persegi() {
        /*Kamus*/
        Persegi opsg;
        double s;
        char coba;

        opsg = new Persegi();

        do {
            System.out.print("\nMasukan sisi persegi: ");
            s = scanner.nextDouble();
            System.out.println("Luas persegi: " + roundingMode(opsg.luas(s)));
            System.out.println("Keliling persegi: " + roundingMode(opsg.keliling(s)));

            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');

        System.out.print("\n");

        mainMenu();
    }

    private static void persegiPanjang() {
        PersegiPanjang opsgpjg;
        double s1, s2;
        char coba;

        opsgpjg = new PersegiPanjang();

        do {
            System.out.print("\nMasukan panjang persegi panjang: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan lebar persegi panjang: ");
            s2 = scanner.nextDouble();
            System.out.println("Luas persegi panjang: " + roundingMode(opsgpjg.luas(s1, s2)));
            System.out.println("Keliling persegi panjang: " + roundingMode(opsgpjg.keliling(s1, s2)));

            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');

        System.out.print("\n");

        mainMenu();
    }

    private static void segitigaSiku() {
        SegitigaSiku ostgsiku;
        double s1, s2;
        char coba;

        ostgsiku = new SegitigaSiku();

        do {
            System.out.print("\nMasukan alas segitiga siku-siku: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan tinggi segitiga siku-siku: ");
            s2 = scanner.nextDouble();
            System.out.println("Sisi miring (hipotenusa): " + roundingMode(ostgsiku.sisiMiring(s1, s2)));
            System.out.println("Luas segitiga: " + roundingMode(ostgsiku.luas(s1, s2)));
            System.out.println("Keliling segitiga: " + roundingMode(ostgsiku.keliling(s1, s2)));

            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');

        System.out.print("\n");

        mainMenu();
    }

    private static void lingkaran() {
        Lingkaran olingkaran;
        double r;
        char coba;

        olingkaran = new Lingkaran();

        do {
            System.out.print("\nMasukan jari-jari lingkaran: ");
            r = scanner.nextDouble();
            System.out.println("Luas lingkaran: " + roundingMode(olingkaran.luas(r)));
            System.out.println("Keliling lingkaran: " + roundingMode(olingkaran.keliling(r)));

            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');

        System.out.print("\n");

        mainMenu();
    }

    private static void jajarGenjang() {
        JajarGenjang ojjrgjg;
        double a, t, b;
        char coba;

        ojjrgjg = new JajarGenjang();

        do {
            System.out.print("\nMasukan alas jajar genjang: ");
            a = scanner.nextDouble();
            System.out.print("Masukan tinggi jajar genjang: ");
            t = scanner.nextDouble();
            System.out.print("Masukan sisi miring jajar genjang: ");
            b = scanner.nextDouble();
            System.out.println("Luas jajar genjang: " + roundingMode(ojjrgjg.luas(a, t)));
            System.out.println("Keliling jajar genjang: " + roundingMode(ojjrgjg.keliling(a, b)));

            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');

        System.out.print("\n");

        mainMenu();
    }

    private static void trapesium() {
        Trapesium otrps;
        double a, b, s;
        char coba;

        otrps = new Trapesium();

        do {
            System.out.print("\nMasukan sisi sejajar a trapesium: ");
            a = scanner.nextDouble();
            System.out.print("Masukan sisi sejajar b trapesium: ");
            b = scanner.nextDouble();
            System.out.print("Masukan sisi miring trapesium: ");
            s = scanner.nextDouble();
            System.out.println("Tinggi trapesium: " + roundingMode(otrps.tinggi(a, b, s)));
            System.out.println("Luas trapesium: " + roundingMode(otrps.luas(a, b, s)));
            System.out.println("Keliling trapesium: " + roundingMode(otrps.keliling(a, b, s)));

            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');

        System.out.print("\n");

        mainMenu();
    }

    private static void layangLayang() {
        LayangLayang olyglyg;
        double d1, d2, ab, bc;
        char coba;

        olyglyg = new LayangLayang();

        do {
            System.out.print("\nMasukan diagonal1/AC layang-layang: ");
            d1 = scanner.nextDouble();
            System.out.print("Masukan diagonal2/BD layang-layang: ");
            d2 = scanner.nextDouble();
            System.out.print("Masukan sisi miring1/AB layang-layang: ");
            ab = scanner.nextDouble();
            System.out.print("Masukan sisi miring2/BC layang-layang: ");
            bc = scanner.nextDouble();
            System.out.println("Luas layang-layang: " + roundingMode(olyglyg.luas(d1, d2)));
            System.out.println("Keliling layang-layang: " + roundingMode(olyglyg.keliling(ab, bc)));

            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');

        System.out.print("\n");

        mainMenu();
    }

    private static void belahKetupat() {
        BelahKetupat oblhktpt;
        double d1, d2;
        char coba;

        oblhktpt = new BelahKetupat();

        do {
            System.out.print("\nMasukan diagonal1/AC belah ketupat: ");
            d1 = scanner.nextDouble();
            System.out.print("Masukan diagonal2/BD belah ketupat: ");
            d2 = scanner.nextDouble();
            System.out.println("Sisi miring belah ketupat: " + roundingMode(oblhktpt.sisiMiring(d1, d2)));
            System.out.println("Luas belah ketupat: " + roundingMode(oblhktpt.luas(d1, d2)));
            System.out.println("Keliling belah ketupat: " + roundingMode(oblhktpt.keliling(d1, d2)));

            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');

        System.out.print("\n");

        mainMenu();
    }

    private static String roundingMode(double number) {
        DecimalFormat df = new DecimalFormat("#.#####");
        df.setRoundingMode(RoundingMode.CEILING);
        return df.format(number);
    }
}
