/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum11032025.Tugas;

/**
 *
 * @author akels
 */
public class Mahasiswa {

    String nama;
    String nim;
    double tugas;
    double kuis;
    double uts;
    double uas;
    double nilaiAkhir;
    String status;
    char grade;

    public Mahasiswa(String nama, String nim, double tugas, double kuis, double uts, double uas) {
        this.nama = nama;
        this.nim = nim;
        this.tugas = tugas;
        this.kuis = kuis;
        this.uts = uts;
        this.uas = uas;
        
    }
    
    public void hitungNilaiAkhir(){
        nilaiAkhir = (int) ((kuis * 0.15) + (tugas * 0.20) + (uts * 0.3) + (uas * 0.35));
        nilaiAkhir();
        cekKelulusan();
    }

    public void nilaiAkhir() {
        if (nilaiAkhir >= 80) {
            grade = 'A';
        } else if (nilaiAkhir >= 70) {
            grade = 'B';
        } else if (nilaiAkhir >= 60) {
            grade = 'C';
        } else if (nilaiAkhir >= 50) {
            grade = 'D';
        } else {
            grade = 'E';
        }
    }
    
    public void cekKelulusan() {
        if(nilaiAkhir>=70){
            status="Lulus";
        }else{
            status="Tidak Lulus";
        }
    }

    public void dataMahasiswa() {
        System.out.println();
        System.out.println("===================================");
        System.out.println("========= Nilai Mahasiswa =========");
        System.out.println("===================================");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM Mahasiswa : " + nim);
        System.out.println("========= Nilai Mahasiswa =========");
        System.out.println("Tugas : " + tugas);
        System.out.println("Kuis : " + kuis);
        System.out.println("UTS : " + uts);
        System.out.println("UAS : " + uas);
        System.out.println("======= Penentuan Kelulusan =======");
        System.out.println("Nilai Akhir :" + nilaiAkhir);
        System.out.println("Grade : " + grade);
        System.out.println("Status : " + status);
        System.out.println("===================================");
    }

}
