/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.objek;

/**
 *
 * @author ronal
 */
public class Hewan {
    
    String nama;
    int berat;
    int jumlah;
    
    public Hewan(String namaHewan){
        nama = namaHewan;
    }
    
    public void beratHewan(int beratHewan){
        berat = beratHewan;
    }
    public void jumlahKaki(int jumlahKaki){
        jumlah = jumlahKaki;
    }
    
    public void cetakHewan(){
        System.out.println("Nama hewan "+ nama);
        System.out.println("Beratnya "+ berat + " kg");
        System.out.println("Jumlah kakinya "+jumlah);
    }
}
