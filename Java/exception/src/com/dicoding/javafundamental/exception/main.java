/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.exception;

/**
 *
 * @author ronal
 */

import java.io.File;
import java.io.FileReader;

public class main {
    
    public static void main(String[] args) {
        
        try {
            String location = "D://tes.txt";
            File file = new File(location);
            FileReader fr = new FileReader(file);
            System.out.println("File Terbaca");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
      int[]a = new int[10];
        try {
            System.out.println("Akses elemen ke 7: "+a[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: "+e);
        } finally {
        a[9]=10;
        System.out.println("Nilai elemen terakhir: "+a[9]);
    }
        
    }
}
