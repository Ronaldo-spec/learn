/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.collection;

/**
 *
 * @author ronal
 * 
 */
import java.util.*;

public class setPlante {
    
    public static void main(String[] args) {
        
        Set<String> planets = new HashSet<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("earth");
        planets.add("earth");
        planets.add("mars");
        
        System.out.println("Set Planets awal: (size = "+ planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t "+planet);
        }
        
        planets.remove("venus");
        
        System.out.println("Set Planets Akhir: "+ planets.size());
        for (Iterator<String> iterator = planets.iterator(); iterator.hasNext();) {
            System.out.println("\t "+ iterator.next());
        }
    }
}
