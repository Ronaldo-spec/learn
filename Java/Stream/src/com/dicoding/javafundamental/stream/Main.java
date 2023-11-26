/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author ronal
 */
public class Main {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        
        
        
        try {
           in = new FileInputStream("D://latihan_input.txt");
           out = new FileOutputStream("D://latihan_ouput.txt");
           int c;
 
           while ((c = in.read()) != -1) {
               out.write(c);
           }
       } catch (IOException e) {
           e.printStackTrace();
       } finally {
           try {
               if (in != null) {
                   in.close();
               }
               if (out != null) {
                   out.close();
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
        
        System.out.println("====================================");
        
        
       
    }
}
