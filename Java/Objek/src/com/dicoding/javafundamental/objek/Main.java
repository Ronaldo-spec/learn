/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.objek;

/**
 *
 * @author ronal
 */
public class Main {
    
    public static void main(String[] args) {
        Hewan elang = new Hewan("Elang");
        Hewan sapi = new Hewan("Sapi");
        
        elang.jumlahKaki(2);
        elang.beratHewan(25);
        elang.cetakHewan();
        
        System.out.println("");
        
        sapi.jumlahKaki(4);
        sapi.beratHewan(100);
        sapi.cetakHewan();
    }
}
