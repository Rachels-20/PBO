/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum04032025;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author akels
 */
public class Array1DRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A[], n, i;
        Scanner in=new Scanner(System.in);
        Random rand= new Random();
        System.out.print("Masukkan banyak data : ");
        n=in.nextInt();
        A= new int[n]; //A ukuran n
        System.out.println("==Data Anda==");
        for(i=0;i<n;i++){
            A[i]=rand.nextInt(100)+1;
            System.out.print(A[i]+"\t");
        }
        int jumlah=0;
        int banyak=0;
        System.out.println();
        System.out.println("==Data Array Bernilai Genap==");
        for(i=0;i<n;i++){
            if(A[i]%2==0){
                System.out.print(A[i]+"\t");
                banyak+=1; //banyak=banyak+1 // banyak++
                jumlah=jumlah+A[i];
            }
        }
        System.out.println("\nbanyak angka genap : "+banyak);
        System.out.println("jumlah angka genap : "+jumlah);
    }
    
}
