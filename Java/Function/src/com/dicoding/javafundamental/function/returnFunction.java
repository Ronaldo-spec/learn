/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.function;

/**
 *
 * @author ronal
 */
public class returnFunction {
    
    public static double hitungLuas (double panjang, double lebar){
        double luas = panjang * lebar;
        return luas;
    }
    
    public static void main(String[] args) {
        double p = 7;
        double l = 6.5;
        double hasil = hitungLuas(p,l);
        System.out.println("Hasilnya adalah: "+hasil);
    }
}
