/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.accessmodifier.package2;

/**
 *
 * @author ronal
 */
import com.dicoding.javafundamental.accessmodifier.package1.kelasA;


public class Main {
    
    public static void main(String[] args) {
        
        kelasA kelasA = new kelasA();
        
        //System.out.println(kelasA.functionB());
        
        //System.out.println(kelasA.memberB);
        //System.out.println(kelasA.memberC);
        
        kelasB kelasB = new kelasB();
        kelasB.methodC();
    }
    
}
