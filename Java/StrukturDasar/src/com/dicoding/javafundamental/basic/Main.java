/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.*;
import com.dicoding.javafundamental.basic.musik.Gitar;

import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;
/**
 *
 * @author ronal
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        Gitar.bunyi();
        
        mobil.jumlahBan();
        motor.jumlahBan();
        kereta.jumlahBan();
 
        Date today = new Date();
        System.out.println("Hari ini: "+today);
        Date tomorrow = DateUtils.addDays(today,1);
        System.out.println("Besok adalah hari: "+tomorrow);
    }
}
