/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.propertimetode;

/**
 *
 * @author ronal
 */
public class Hewan {
    
    double tinggi = 30;
    double berat = 3;
    int umur;
    
    Hewan (int umur){
        this.umur = umur;
    }
    
    void lari (){
        System.out.println("Sedang berlari...");
    }
    void jalan (){
        System.out.println("Berjalan santai...");
    }
    void makan(){
        System.out.println("Maem sedaap...");
    }
    
    double getBerat(){
        return berat;
    }
    
    double getTinggi(){
        return tinggi;
    }
    
    int getUmur(){
        return umur;
    }
}
