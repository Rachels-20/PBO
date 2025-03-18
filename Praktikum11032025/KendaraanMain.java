/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum11032025;

import java.util.Scanner;

/**
 *
 * @author akels
 */
public class KendaraanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in= new Scanner(System.in);
        String jenis;
        String merk;
        int tahun;
        String warna;
        int harga;
        int v;
        
        System.out.print("Masukkan jenis kendaraan = ");
        jenis=in.nextLine();
        System.out.print("Masukkan merk Kendaraan = ");
        merk=in.nextLine();
        System.out.print("Masukkan tahun keluaran = ");
        tahun=in.nextInt();
        in.nextLine(); //pembersihan line untuk string jika diinput setelah int
        System.out.print("Masukkan warna kendaraan = ");
        warna=in.nextLine();
        System.out.print("Masukkan harga sewa kendaraan = ");
        harga=in.nextInt();
        System.out.print("Masukkan kecepatan kendaraan = ");
        v=in.nextInt();
        
        //objek baru -- class kendaraan
        Kendaraan kend= new Kendaraan(jenis, merk, tahun, warna);
        kend.InfoKendaraan();
        kend.CekHarga(harga);
        kend.Speed(v);
    }
    
}
