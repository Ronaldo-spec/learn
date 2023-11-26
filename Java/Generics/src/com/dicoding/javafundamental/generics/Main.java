/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.generics;

/**
 *
 * @author ronal
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        List lo = new ArrayList();
        lo.add(new Planet("Bumi", 0.07));
        
        for (Object o : lo) {
            Planet p = (Planet) o;
            p.print();
        }
        
        List<Planet> lp = new ArrayList();
        lp.add(new Planet("Bumi", 0.07));
        lp.add(new Planet("Mars", 0.82));
        
        for (Planet p : lp) {
            p.print();
        }
    }
}
