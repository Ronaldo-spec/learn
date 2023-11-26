/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.function;

/**
 *
 * @author ronal
 */
public class methodOverloading {
    
    public static void main(String[] args) {
        double p = 8;
        double l = 10.5;
        double hasil = hitungLuas(p,l);
        System.out.println("Luasnya adalah: "+hasil);
        
        int p2 = 8;
        int l2 = 6;
        int hasil2 = hitungLuas(p2,l2);
        System.out.println("Luasnya adalah: "+hasil2);
    }
    
    public static double hitungLuas (double panjang, double lebar){
        double luas = panjang * lebar;
        return luas;
    }
    
    public static int hitungLuas (int panjang, int lebar){
        int luas = panjang * lebar;
        return luas;
    }
}
