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


public class kelasB extends kelasA {
    
    
    @Override
    protected void methodC () {
        super.methodC();
        
        System.out.println("Contoh pemanggilan protected dari package luar");
    }
}
