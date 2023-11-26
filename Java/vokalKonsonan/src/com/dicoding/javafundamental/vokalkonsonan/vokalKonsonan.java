/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.javafundamental.vokalkonsonan;

/**
 *
 * @author ronal
 */
import java.util.Scanner;
public class vokalKonsonan {
    public static void main(String[] args) {
        String word ="";
        int vokal = 0;
        int konsonan = 0;
        
        System.out.print("Masukan kalimat : ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();
        
        vokal = num_vokal(word);
        konsonan = num_konsonan(word);
        
        System.out.println("Jumlah huruf vokal : " +vokal);
        System.out.println("Jumlah huruf konsonan : " +konsonan);
    }
    
    private static int num_vokal(String word){
        int i;
        int jumlahVokal = 0;
        
        for (int j = 0; j < word.length(); j++) {
            if (word.charAt(j)== 'a' || word.charAt(j)=='i'|| word.charAt(j)=='u' || word.charAt(j)=='e' || word.charAt(j)=='o') {
                jumlahVokal++;
            }
        }
        return jumlahVokal;
    }
    
    private static int num_konsonan(String word){
        int i;
        int jumlahKonso = 0;
        
        for (int j = 0; j < word.length(); j++) {
            if (word.charAt(j)!= 'a' && word.charAt(j)!='i'&& word.charAt(j)!='u' && word.charAt(j)!='e' && word.charAt(j)!='o') {
                jumlahKonso++;
            }
        }
        return jumlahKonso;
    }
}
