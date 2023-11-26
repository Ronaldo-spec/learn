/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.suhuair;

/**
 *
 * @author ronal
 */
import java.util.Scanner;

public class suhuAir {
    
    public static void main(String[] args) {
        
        int T;
        
        System.out.println("Contoh IF 3 Kasus");
        System.out.print("Suhu (Celcius) = ");
        
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        
        if (T < 0) {
            System.out.println("Air Beku");
        } else if ((T > 0) && (T < 100)){
            System.out.println("Air Lumer");
        } else if (T >= 100) {
            System.out.println("Air Menguap");
        }
    }
}
