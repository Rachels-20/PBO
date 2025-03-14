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
public class Array2DRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int M[][];
        int O[][];
        int Z[][];
        int i,j,b,k,b2,k2;
        Scanner in=new Scanner(System.in);
        Random rand=new Random();
        System.out.print("Masukkan jumlah baris: ");
        b=in.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        k=in.nextInt();
        M=new int[b][k];
        //mengisi array 2 dimensi secara random
        System.out.println("==Isi Matrix==");
        for(i=0;i<b;i++){
            for(j=0;j<k;j++){
                M[i][j]=rand.nextInt(100)+1;
                System.out.print(M[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Masukkan jumlah baris: ");
        b2=in.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        k2=in.nextInt();
        O=new int[b2][k2];
        //mengisi array 2 dimensi secara random
        Z= new int[b][k];
        System.out.println("==Isi Matrix==");
        for(i=0;i<b2;i++){
            for(j=0;j<k2;j++){
                O[i][j]=rand.nextInt(100)+1;
                System.out.print(O[i][j]+"\t");
            }
            System.out.println();
        }
        int jumlah=0;
        System.out.println("==Penjumlahan Matrix==");
        if(b==b2 && k==k2){
            Z=new int[b][k];
            for(i=0;i<b;i++){
                for(j=0;j<k;j++){
                Z[i][j]=M[i][j]+O[i][j];
                System.out.print(Z[i][j]+"\t");
                }
            System.out.println();
            }
        }
        else
            System.out.println("jumlah baris dan kolom tdak sesuai, gagal");
        
        System.out.println();
    }
    
}
