/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.bangundatar;

/**
 *
 * @author ronal
 */
public class lingkaran implements bangundatar {
    
    private double phi = 3.14;
    
    lingkaran () {
        
    }
    
    @Override
    public double luas(int s1, int s2) {
        return 0;
    }
    
    @Override
    public double keliling(int s1, int s2) {
        return 0;
    }
    
  
    public double luas(int r) {
        return (phi * r * r);
    }
    
    
    public double keliling(int r) {
        return (2 * phi * r);
    }
}
