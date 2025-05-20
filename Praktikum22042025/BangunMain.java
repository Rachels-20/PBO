/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum22042025;

import java.util.Scanner;

/**
 *
 * @author akels
 */
public class BangunMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in= new Scanner(System.in);
        
        double r, t;
       
        System.out.print("Bangun"+("\nMasukkan jari-jari "));
        r=in.nextDouble();
        System.out.print("Masukkan tinggi ");
        t=in.nextDouble();
        
        Lingkaran l1=new Lingkaran(r);
        Kerucut k1= new Kerucut(r,t);
        Silinder s1= new Silinder(r,t);
        
        System.out.println();
        
        System.out.println(l1.toString());
        System.out.println(k1.toString());
        System.out.println("volume = "+k1.getLuas());
        System.out.println(s1.toString());
        System.out.println("volume = "+s1.getLuas());
    }
    
}
