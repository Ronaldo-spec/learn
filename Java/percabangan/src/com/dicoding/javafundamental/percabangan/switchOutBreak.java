/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.percabangan;

/**
 *
 * @author ronal
 */
public class switchOutBreak {
    
    public static void main(String[] args) {
        char input = 'C';
        int output = 0;
        switch (input){
            case 'A':
                output++;
            case 'B':
                output++;
            case 'C':
                output++;
            case 'D':
                output++;
            case 'E':
                output++;
            default:
                output++;
        }
        System.out.println("Nilainya adala: "+ output);
    }
}
