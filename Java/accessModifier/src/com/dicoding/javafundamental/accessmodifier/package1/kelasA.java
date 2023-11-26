/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.accessmodifier.package1;

/**
 *
 * @author ronal
 */
public class kelasA {
 
    private int memberA = 5;
    
    char memberB = 'A';
    double memberC = 1.5;
    
    private int functionA(){
        return memberA;
    }
    int functionB() {
        int hasil = functionA() + memberA;
        return hasil;
    }
    
    protected void methodC() {
        System.out.println("Percobaan access Modifier");
    }
}
