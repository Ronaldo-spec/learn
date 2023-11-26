/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.inheritance;

/**
 *
 * @author ronal
 */
public class Kucing extends Hewan implements Mamalia{
    
    private String ras;
    private String habitat;
    
    public Kucing (String ras, String habitat) {
        this.ras = ras;
        this.habitat = habitat;
    }
    
    @Override
    public String toString() {
        return "Kucing ras: " + ras + ", habitas: " + habitat;
    }
    
    @Override
    public boolean equals (Object obj){
        if (obj instanceof Kucing) {
            Kucing other = (Kucing)obj;
            return this.ras.equals(other.ras);
        } else {
            return false;
        }
    }
    
   public Kucing(){
       super();
       System.out.println("construct kucing");
   }
   public void makan() {
       System.out.println("Kucing sedang makan..");
   }
   
   public void makan (String food){
       System.out.println("Kucing makan "+food);
   }
}
