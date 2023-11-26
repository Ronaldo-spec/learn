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
import java.util.Collection;
import java.util.List;

public class wildcard {
    
    public static void main(String[] args) {
        List<String> ls = new ArrayList();
        ls.add("String 1");
        ls.add("String 2");
        
        print(ls);
        
        Collection<Planet> cp = new ArrayList();
        cp.add(new Planet("Pluto",0.01));
        cp.add(new Planet("Saturnus", 0.98));
        
        print(cp);
        
        }
    
    public static void print(Collection<?> collection){
            for (Object o : collection) {
                System.out.println(o);
            }
    }
    
    static <T> void arrayToCollection(T[] a, Collection<T> c){
        for (T o : a) {
            c.add(o);
        }
    }
}
