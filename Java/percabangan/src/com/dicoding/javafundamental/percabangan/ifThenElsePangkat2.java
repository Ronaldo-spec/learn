/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.percabangan;

/**
 *
 * @author ronal
 */
public class ifThenElsePangkat2 {
    
    public static void main(String[] args) {
        int nilaiUjian = 25;
        char ipk;
        
        if (nilaiUjian>=90) {
            ipk = 'A';
        } else if (nilaiUjian>=80) {
            ipk = 'B';
        } else if (nilaiUjian>=70) {
            ipk = 'C';
        } else if (nilaiUjian>=60) {
            ipk = 'D';
        } else if (nilaiUjian>=50) {
            ipk = 'E';
        } else {
            ipk = 'F';
        }
        
        System.out.println(ipk);
    }
}
