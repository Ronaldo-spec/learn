/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.inputoutput;

/**
 *
 * @author ronal
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class userBufferedReader {

    public static void main(String[] args) {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Program penjumlahan sederhana");

        int value = 0;
        int value2 = 0;
        
        try {
            System.out.print("Masukkan angka pertama: ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Masukkan angka kedua: ");
            value2 = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        int result = value + value2;
        
        System.out.println("Hasilnya adalah: "+result);
    }

}
