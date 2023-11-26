/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.collection;

/**
 *
 * @author ronal
 */
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class listPlanet {
    
    public static void main(String[] args) {
        String [] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";
        
        List<String> planets = new ArrayList<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");
        
        System.out.println("List Platen awal: ");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index ke-"+i+", merupakan planet "+ planets.get(i));
        }
        
        planets.remove("venus");
        System.out.println("List Planet Akhir: ");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index ke-"+i+", merupakan planet "+ planets.get(i));
            if (i+1 == planets.size()) {
                int tot = i +1;
                System.out.println("Total planet adalah: "+tot);
            }
        }
    }
}
