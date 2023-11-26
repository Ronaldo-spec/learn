/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.stream;

/**
 *
 * @author ronal
 */

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class fileStream {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        
         try {
            in = new FileReader("D://latihan_input.txt");
            out = new FileWriter("D://latihan_ouput.txt");
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
    }
}
