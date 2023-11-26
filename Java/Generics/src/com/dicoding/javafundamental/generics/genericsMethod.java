/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.generics;

import java.util.Collection;
import java.util.ArrayList;

/**
 *
 * @author ronal
 */
public class genericsMethod {
    
    private static <T> void arrayToCollection(T[] a, Collection<T> c){
        for (T o : a) {
            c.add(o);
        }
    }
    
    public static void main(String[] args) {
        Object[]oa = new Object[100];
        Collection<Object> co = new ArrayList();
        arrayToCollection(oa, co);
        
        String[] sa = new String[100];
        Collection<String> cs = new ArrayList();
        arrayToCollection(sa, cs);
        
        arrayToCollection(sa, co);
        
        Integer[] ia = new Integer[100];
        Float[] fa = new Float[100];
        Number[] na = new Number[100];
        Collection<Number> cn = new ArrayList();
 
        // T inferred to be Number
        arrayToCollection(ia, cn);
        
        // T inferred to be Number
        arrayToCollection(fa, cn);
        
        // T inferred to be Number
        arrayToCollection(na, cn);
        
        // T inferred to be Object
        arrayToCollection(na, co);
        
        // compile-error
        //arrayToCollection(na, cs);
    }
}
