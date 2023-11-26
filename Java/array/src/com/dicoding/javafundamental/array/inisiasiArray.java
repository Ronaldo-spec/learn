/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.array;

/**
 *
 * @author ronal
 */
public class inisiasiArray {
    
    public static void main(String[] args) {
        
        int[] arrInt = new int[1000000];
        
        
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i]=i+1;
            System.out.println(arrInt[i]);
            if (i==100) {
                break;
            }
        }
        
    }
}
