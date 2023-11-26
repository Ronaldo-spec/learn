/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.collection;

/**
 *
 * @author ronal
 */
class Planet {
    private String name;
    private double mass;
    
    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }
    
    public String toString() {
        return "Planet " + name + ", mass: "+ mass;
    }
}
