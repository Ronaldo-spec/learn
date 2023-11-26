/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.stream;

/**
 *
 * @author ronal
 */
import java.io.File;

public class mkdir {

    public static void main(String[] args) {
        
        String dirname = "D://TUGAS";
        File file = new File(dirname);
        // Buat directory
        file.mkdirs();
        
        System.out.println("=========================");
        String dirname1 = "D://TUGAS";
        File file1 = null;
        String[] paths;
        try {
            // Instansiasi objek File
            file1 = new File(dirname1);
            // Ambil list files dan masukkan ke string paths
            paths = file1.list();
            // Tampilkan semua path yang ada
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
}
