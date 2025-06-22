/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum11032025.Tugas;

import java.util.Scanner;

/**
 *
 * @author akels
 */
public class InputNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner get= new Scanner (System.in);
        double uts, kuis, tugas, uas, nilaiAkhir;
        String nama, status;
        String nim;
        char grade;
        
        System.out.println("==================================");
        System.out.println("===== Sistem Nilai Mahasiswa =====");
        System.out.println("==================================");
        System.out.println("Masukkan Nama Mahasiswa ");
        nama=get.nextLine();
        System.out.println("Masukkan NIM Mahasiswa ");
        nim=get.nextLine();
        System.out.print("Masukkan Nilai Tugas Mahasiswa = ");
        tugas=get.nextInt();
        System.out.print("Masukkan Nilai Kuis Mahasiswa = ");
        kuis=get.nextInt();
        System.out.print("Masukkan Nilai UTS Mahasiswa = ");
        uts=get.nextInt();
        System.out.print("Masukkan Nilai UAS Mahasiswa = ");
        uas=get.nextInt();
        
        
        
        Mahasiswa mahasiswa1 = new Mahasiswa(nama,nim,tugas,kuis,uts,uas);
        mahasiswa1.hitungNilaiAkhir();
        mahasiswa1.dataMahasiswa();
        
    }
    
}
