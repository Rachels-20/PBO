/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5soal;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author akels
 */
public class Gabung2Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A[];
        int B[];
        int i,n,m;
        
        Scanner in=new Scanner(System.in);
        Random rand= new Random();
        
        System.out.println("Penggabungan 2 Array");
        System.out.print("Masukkan ukuran array A ");
        n=in.nextInt();
        A= new int[n];
        
        System.out.print("Masukkan ukuran array B ");
        m=in.nextInt();
        B= new int[m];
        
        //array A
        System.out.print("array A : ");
        for(i=0;i<n;i++){
            A[i]=rand.nextInt(100)+1;
            System.out.print(A[i]+"\t");
        }
        //array B
        System.out.print("\narray B : ");
        for(i=0;i<m;i++){
            B[i]=rand.nextInt(100)+1;
            System.out.print(B[i]+"\t");
        }
        
        int C[];
        C=new int[n+m];
        System.out.print("\nArray C : ");
        if(n > m) {
            for(i=0;i<n;i++) 
                System.out.print(" " + A[i] + " ");
            for(i=0;i<m;i++)
                System.out.print(" " + B[i] + " ");
        }
        else{
            for(i=0;i<m;i++) 
                System.out.print(" " + B[i] + " ");
            for(i=0;i<n;i++)
                System.out.print(" " + B[i] + " ");
        }
        System.out.print("\nArray yang terbesar berada di kanan, jika sama array B berada di kanan");
        
        
        
        
    }
    
}
