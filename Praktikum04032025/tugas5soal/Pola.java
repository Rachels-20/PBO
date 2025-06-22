/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5soal;

import java.util.Scanner;

/**
 *
 * @author akels
 */
public class Pola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Program Pola");

        System.out.print("Masukkan jumlah Pola: ");
        n = in.nextInt();
        
        int i, j;
        
        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == j)
                    System.out.print(" 0 ");
                else 
                    System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    
}
