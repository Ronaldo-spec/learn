/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.perulangan;

/**
 *
 * @author ronal
 */
public class forBersarang {
    
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i <= a; i++) {
            if (i>4) {
                System.out.print(" ");
            } else {
                System.out.println("*");
            }
            for (int j = 0; j <= i; j++) {
                if (i>3) {
                    System.out.println(" ");
                } else {
                    System.out.println("*");
                }
            }
            System.out.println("");
        }
    }
}
