/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.accessmodifier.package3;

/**
 *
 * @author ronal
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Nilainya adalah "+perhitungan.nilai);
        
        for (int i = 0; i < 5; i++) {
            new perhitungan();
        }
        System.out.println("Sampai "+perhitungan.nilai);
        
        System.out.println("getNilai memiliki nilai "+perhitungan.getNilai());
    }
}
