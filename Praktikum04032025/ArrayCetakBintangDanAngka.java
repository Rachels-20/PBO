/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum04032025;

import java.util.Scanner;

/**
 *
 * @author akels
 */
public class ArrayCetakBintangDanAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,n,b,k;
        int A[][];
        int B[][];
        int C[][];
        int D[][];
        Scanner in=new Scanner(System.in);
        
        System.out.println("Cetak bintang segitiga siku-siku");
        System.out.print("Masukkan jumlah: ");
        n=in.nextInt();
        //for bintang segitiga siku-siku
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Cetak bintang segitiga siku-siku terbalik");
        System.out.print("Masukkan jumlah: ");
        n=in.nextInt();
        //for bintang segitiga siku-siku
        for(i=n;i>0;i--){
            for(j=i;j>0;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        
        int a=0;
        System.out.println("Cetak tabel angka berurutan");
        System.out.print("Masukkan jumlah: ");
        n=in.nextInt();
        //for bintang segitiga siku-siku
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a++;
                System.out.print(" "+a+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Cetak tabel angka berurutan terbalik");
        System.out.print("Masukkan jumlah: ");
        n=in.nextInt();
        //for bintang segitiga siku-siku
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(" "+a+" ");
                a--;
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
