/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum20052025;

import java.util.Scanner;

/**
 *
 * @author akels
 */
public class MainDinamis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Elektronik[] daftarBarang = new Elektronik[10];
        int count = 0;
        int pilihan;

        do {
            System.out.println("\n=== MENU INPUT BARANG ELEKTRONIK ===");
            System.out.println("1. Elektronik");
            System.out.println("2. SmartWatch");
            System.out.println("3. Laptop");
            System.out.println("0. Selesai & Tampilkan Semua");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine(); // Buang newline

            switch (pilihan) {
                case 1:
                    Elektronik e = new Elektronik();
                    System.out.print("Merek: ");
                    e.setMerek(input.nextLine());
                    System.out.print("Tahun Produksi: ");
                    e.setTahunProduksi(input.nextInt());
                    System.out.print("Garansi (tahun): ");
                    e.setGaransi(input.nextInt());
                    daftarBarang[count++] = e;
                    break;

                case 2:
                    SmartWatch sw = new SmartWatch();
                    System.out.print("Merek: ");
                    sw.setMerek(input.nextLine());
                    System.out.print("Tahun Produksi: ");
                    sw.setTahunProduksi(input.nextInt());
                    System.out.print("Garansi (tahun): ");
                    sw.setGaransi(input.nextInt());
                    System.out.print("Kapasitas Baterai (mAh): ");
                    sw.setKapasitasBaterai(input.nextInt());
                    System.out.print("Jumlah Kamera: ");
                    sw.setJumlahKamera(input.nextInt());
                    System.out.print("Ukuran Layar (px): ");
                    sw.setUkuranLayar(input.nextInt());
                    System.out.print("Tahan Air (true/false): ");
                    sw.setTahanAir(input.nextBoolean());
                    daftarBarang[count++] = sw;
                    break;

                case 3:
                    Laptop lp = new Laptop();
                    System.out.print("Merek: ");
                    lp.setMerek(input.nextLine());
                    System.out.print("Tahun Produksi: ");
                    lp.setTahunProduksi(input.nextInt());
                    System.out.print("Garansi (tahun): ");
                    lp.setGaransi(input.nextInt());
                    System.out.print("Ukuran Layar (inch): ");
                    lp.setUkuranLayar(input.nextInt());
                    System.out.print("Kapasitas RAM (GB): ");
                    lp.setKapasitasRAM(input.nextInt());
                    daftarBarang[count++] = lp;
                    break;

                case 0:
                    System.out.println("\n=== DAFTAR BARANG YANG DIINPUTKAN ===");
                    for (int i = 0; i < count; i++) {
                        daftarBarang[i].display();
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
    }

}
