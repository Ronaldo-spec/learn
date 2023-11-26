/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.propertimetode;

/**
 *
 * @author ronal
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan (2);
        kucing.makan();
        kucing.jalan();
        kucing.lari();
        
        System.out.println("Umurnya adalah: "+kucing.getUmur());
        
        double bmi = kucing.getBerat()/ ((kucing.getTinggi()*0.01) * (kucing.getTinggi() * 0.01));
    
        System.out.println("BMI nya adalah: "+bmi);
}
}