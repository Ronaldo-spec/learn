/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.bangundatar;

/**
 *
 * @author ronal
 */
public class segitigaSiku implements bangundatar {
    
    segitigaSiku() {
        
    }
    
    @Override
    public double luas(int s1, int s2) {
        return (0.5 *  s1 * s2);
    }
    
    @Override
    public double keliling(int s1, int s2) {
        return (s1 * s2 + Math.sqrt((s1 * s2) + (s2 * s2)));
    }
}
