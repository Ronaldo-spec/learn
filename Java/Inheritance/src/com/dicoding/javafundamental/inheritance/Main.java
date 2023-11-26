/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.inheritance;

/**
 *
 * @author ronal
 */
public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        System.out.println("Apakah hewan adalah objek: "+ (hewan instanceof Object));
        System.out.println("Apakah hewan adalah objek: "+ (hewan instanceof Hewan));
        System.out.println("Apakah hewan adalah objek "+ (hewan instanceof Kucing));
        
        System.out.println("-------------------------------");
        
        Kucing kucing = new Kucing();
        System.out.println("Apakah hewan adalah objek: "+ (kucing instanceof Object));
        System.out.println("Apakah hewan adalah objek: "+ (kucing instanceof Hewan));
        System.out.println("Apakah hewan adalah objek: "+ (kucing instanceof Kucing));
        
        System.out.println("-------------------------------");
        
        hewan.makan();
        kucing.makan();
        kucing.makan("ikan asin");
        
        System.out.println("-------------------------------");
        
        Kucing meow = new Kucing("british", "tropis");
        Kucing puss = new Kucing("british", "subtropis");
        Kucing popo = new Kucing("kampung", "subtropis");
        
        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());
        
        System.out.println("meow equals puss ? " + meow.equals(puss));
        System.out.println("meow equals popo ? " + meow.equals(popo));
        
        System.out.println("-------------------------------");
        
        Object o = new Kucing();
        Hewan h = new Kucing();
        Kucing k = new Kucing();
        
        h.makan();
        k.makan();
        
        Object object = k;
        Hewan hewanK = k;
        hewanK.makan();
        
        Kucing kucingK = (Kucing) h;
        kucingK.makan();
        
        Hewan harimau = new Hewan();
        //Kucing anggora = (Kucing) harimau;
}
}
