/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.inputoutput;

/**
 *
 * @author ronal
 */
import java.util.Scanner;

public class inputOutputFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sederhana");
        System.out.print("Masukkan angka pertama: ");
        int value = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int value2 = scanner.nextInt();
        int result = value + value2;
        System.out.println("Hasilnya adalah: "+result);
    }
}
