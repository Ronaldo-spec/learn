/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.bangundatar;

/**
 *
 * @author ronal
 */
public class persegiPanjang implements bangundatar {

    public persegiPanjang() {
        
    }
    
    @Override
    public double luas(int s1, int s2) {
        return (s1*s2);
    }
    
    @Override
    public double keliling(int s1,int s2) {
        return (2 * (s1 + s2));
    }
    
}
