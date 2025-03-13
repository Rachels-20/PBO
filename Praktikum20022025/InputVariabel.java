/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum20022025;

import java.util.Scanner;

/**
 *
 * @author akels
 */
public class InputVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
     int umur;
     char jk;
     float rapor;
     boolean asal;
     Scanner input = new Scanner (System.in);
     System.out.println("==Program Input Variabel==");
     System.out.print("Nama Anda = ");
     nama = input.nextLine(); //baca string
     System.out.print("Umur anda = ");
     umur = input.nextInt(); 
     System.out.print("Gender (L/P) = ");
     jk = input.next(). charAt(0);
     System.out.print("Rata-rata Rapor = ");
     rapor = input.nextFloat();
     System.out.print("Asal Padang (true/false)? ");
     asal = input.nextBoolean();
     System.out.println ("==Input data anda==");
     System.out.println ("Nama anda = "+nama);
     System.out.println ("Umur anda = "+umur+" tahun");
     System.out.println ("Gender anda = "+jk);
     System.out.println ("Rata rata rapor = "+rapor);
     if (asal) //asal = true
         System.out.println ("Anda berasal dari Padang");
     else // asal false
         System.out.println("anda tidak berasal dari padang");
     //end if
    }
    
}
