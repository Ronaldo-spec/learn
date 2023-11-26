/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.bangundatar;

/**
 *
 * @author ronal
 */
import java.util.Scanner;

public class main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        persegiPanjang pp;
        segitigaSiku ss;
        lingkaran l;

        int s1, s2, r;

        pp = new persegiPanjang();
        ss = new segitigaSiku();
        l = new lingkaran();

        mainMenu();

        switch (pilihan) {
            case '1': {
                System.out.print("Masukkan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + pp.luas(s1, s2));
                System.out.println("Keliling persegi panjang: " + pp.keliling(s1, s2));
                break;
            }
            case '2': {
                System.out.print("Masukkan alas segitiga: ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan tinggi segitiga: ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitaga: " + ss.luas(s1, s2));
                System.out.println("Keliling segitiga: " + ss.keliling(s1, s2));
                break;
            }
            case '3': {
                System.out.print("Masukkan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("Luas segitaga: " + l.luas(r));
                System.out.println("Keliling segitiga: " + l.keliling(r));
                break;
            }
            default: {
                System.out.println("Pilihan salah");
                break;
            }
        }
    }

    private static void mainMenu() {
        System.out.println("====================");
        System.out.println("Hitung Luas dan Keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}
