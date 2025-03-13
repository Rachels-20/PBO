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

public class Swalayan {
    public static void main(String[] args) {
        int menu, jumlah;
        char ulang=' ';
        int totalHarga = 0, totalDiskon = 0, totalBayar;
        Scanner in = new Scanner(System.in);
        do{
        System.out.println("!!!!!!!!! Program Swalayan !!!!!!!!!!");
        System.out.println("=====================================");
        System.out.println("|  MEREK |   HARGA   |    DISKON    |");
        System.out.println("=====================================");
        System.out.println("| 1. X   | Rp.40.000 | 10% (≥3 kotak) |");
        System.out.println("| 2. Y   | Rp.50.000 | 12% (>3 kotak) |");
        System.out.println("| 3. Z   | Rp.60.000 | 15% (kotak ke-2+) |");
        System.out.println("=====================================");

        System.out.print("\nPilih nomor merek susu (1/2/3): ");
        menu = in.nextInt();

        System.out.print("Jumlah kotak: ");
        jumlah = in.nextInt();

        switch (menu) {
            case 1: { // Merek X
                totalHarga = jumlah * 40000;
                if (jumlah >= 3) {
                    totalDiskon = (int) (totalHarga * 0.1); // Diskon 10%
                }
            }
            break;

            case 2: { // Merek Y
                totalHarga = jumlah * 50000;
                if (jumlah > 3) {
                    totalDiskon = (int) (totalHarga * 0.12); // Diskon 12%
                }
            }
            break;

            case 3: { // Merek Z
                if (jumlah > 0) {
                    totalHarga = 60000; // Harga kotak pertama tanpa diskon
                    if (jumlah > 1) {
                        long hargaDiskonZ = (jumlah - 1) * 60000;
                        totalDiskon = (int) (hargaDiskonZ * 0.15); // Diskon 15% dari kotak ke-2 dan seterusnya
                        totalHarga += hargaDiskonZ;
                    }
                }
            }
            break;

            default:{
                System.out.println("Pilihan tidak tersedia.");
            }break;
        }

        // Hitung total pembayaran setelah diskon
        totalBayar = totalHarga - totalDiskon;

        // Tampilkan hasil perhitungan
        System.out.println("\n==== Rincian Pembelian ====");
        System.out.println("Total Harga Sebelum Diskon : Rp. " + totalHarga);
        System.out.println("Total Diskon               : Rp. " + totalDiskon);
        System.out.println("Total Pembayaran           : Rp. " + totalBayar);
            
        System.out.print("\nApakah ingin mengulang pembelian? (y/n): ");
        ulang = in.next().charAt(0);
        }while(ulang=='y'||ulang=='Y');
        System.out.println("\nTerima kasih telah berbelanja!");
        in.close();
    }
}
