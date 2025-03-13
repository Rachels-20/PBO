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
public class PermutasiKombinasi {
    public static void main(String[] args) {
        int n,r;
        Scanner in= new Scanner(System.in);
        System.out.println("Permutasi dan Kombinasi");
        
        //input nilai n dan r
        System.out.print("Masukkan n = ");
        n=in.nextInt();
        System.out.print("Masukkan r = ");
        r=in.nextInt();
        
        //proses
        
        int i;
        int nh=n; //nh adalah n hasil 
        
        for(i=n-1;i>0;i--){
            nh=nh*i;
        }
        
        int rh=r; //rh adalah r hasil
        
        for(i=r-1;i>0;i--){
            rh=rh*i;
        }
        
        int nr=n-r;
        int nrh=nr; //nrh adalah nr hasil
        
        for(i=nr-1; i>0; i--){
            nrh=nrh*i;
        }
        
        //permutasi
        System.out.println("permutasi: n!/(n-r)!");
        System.out.println(n + "!/(" + n + " - " + r + ")!");
        System.out.println(n + "!/" + nr + "!");
        System.out.println(nh+"/"+nrh);
        System.out.println(nh/nrh);
        
        //kombinasi
        System.out.println("Kombinasi: n!/r!(n-r)!");
        System.out.println(n + "!/" + r + "!(" + n + " - " + r + ")!");
        System.out.println(n + "!/" + r + "!(" + nr +")!");
        System.out.println(nh + "/" + rh + "(" + nrh + ") ");
        System.out.println(nh/(rh*nrh));
    }
}
