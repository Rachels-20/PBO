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

public class Matriks {
    public static void main(String[] args) {
        int X[][], Y[][];
        int bX, kX, bY, kY;
        int menu;
        
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        char ulang = ' ';
        
        do {
    System.out.println("=====Program Matriks=====");
    System.out.println("1. Tambah\n2. Kurang\n3. Kali\n4. Identitas\n5. Transpose\n6. Exit");
    System.out.print("Pilih program yang ingin dijalankan: ");
    menu = in.nextInt();

    if (menu > 0 && menu < 6) {
        // Meminta input ukuran matriks dan melakukan operasi
        System.out.print("Masukkan jumlah baris array X: ");
        bX = in.nextInt();
        System.out.print("Masukkan jumlah kolom array X: ");
        kX = in.nextInt();
        System.out.print("Masukkan jumlah baris array Y: ");
        bY = in.nextInt();
        System.out.print("Masukkan jumlah kolom array Y: ");
        kY = in.nextInt();

        X = new int[bX][kX];
        Y = new int[bY][kY];

        int i, j, k;

        // Mengisi Matriks X
        System.out.println("Matriks X: ");
        for (i = 0; i < bX; i++) {
            for (j = 0; j < kX; j++) {
                X[i][j] = rand.nextInt(10) + 1;
                System.out.print(X[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Mengisi Matriks Y
        System.out.println("Matriks Y: ");
        for (i = 0; i < bY; i++) {
            for (j = 0; j < kY; j++) {
                Y[i][j] = rand.nextInt(10) + 1;
                System.out.print(Y[i][j] + "\t");
            }
            System.out.println();
        }   

        // Menjalankan operasi sesuai menu
        switch (menu) {
            case 1:
                if (bX == bY && kX == kY) {
                    int[][] Tambah = new int[bX][kX];
                    System.out.println("Hasil Penjumlahan:");
                    for (i = 0; i < bX; i++) {
                        for (j = 0; j < kX; j++) {
                            Tambah[i][j] = X[i][j] + Y[i][j];
                            System.out.print(Tambah[i][j] + "\t");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Jumlah baris/kolom tidak sama, tidak dapat menjumlahkan matriks.");
                }
                break;

            case 2:
                if (bX == bY && kX == kY) {
                    int[][] Kurang = new int[bX][kX];
                    System.out.println("Hasil Pengurangan:");
                    for (i = 0; i < bX; i++) {
                        for (j = 0; j < kX; j++) {
                            Kurang[i][j] = X[i][j] - Y[i][j];
                            System.out.print(Kurang[i][j] + "\t");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Jumlah baris/kolom tidak sama, tidak dapat mengurangkan matriks.");
                }
                break;

            case 3:
                if (kX == bY) {
                    int[][] Kali = new int[bX][kY];
                    System.out.println("Hasil Perkalian:");
                    for (i = 0; i < bX; i++) {
                        for (j = 0; j < kY; j++) {
                            for (k = 0; k < kX; k++) {
                                Kali[i][j] += X[i][k] * Y[k][j];
                            }
                            System.out.print(Kali[i][j] + "\t");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Jumlah kolom X harus sama dengan jumlah baris Y untuk perkalian matriks.");
                }
                break;

            case 4:
                if (bX == kX) {
                    System.out.println("Matriks Identitas X:");
                    for (i = 0; i < bX; i++) {
                        for (j = 0; j < kX; j++) {
                            System.out.print((i == j ? 1 : 0) + "\t");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Matriks X bukan matriks persegi, tidak memiliki identitas.");
                }

                if (bY == kY) {
                    System.out.println("Matriks Identitas Y:");
                    for (i = 0; i < bY; i++) {
                        for (j = 0; j < kY; j++) {
                            System.out.print((i == j ? 1 : 0) + "\t");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Matriks Y bukan matriks persegi, tidak memiliki identitas.");
                }
                break;

            case 5:
                System.out.println("Transpose Matriks X:");
                for (i = 0; i < kX; i++) {
                    for (j = 0; j < bX; j++) {
                        System.out.print(X[j][i] + "\t");
                    }
                    System.out.println();
                }

                System.out.println("Transpose Matriks Y:");
                for (i = 0; i < kY; i++) {
                    for (j = 0; j < bY; j++) {
                        System.out.print(Y[j][i] + "\t");
                    }
                    System.out.println();
                }
                break;
        }
    } 
    else if (menu == 6) {
        System.out.println("Selesai.");
        break; // Keluar dari perulangan
    } 
    else {
        System.out.println("Pilihan tidak tersedia, coba lagi.");
    }

    // Hanya minta input pengulangan sekali
    System.out.print("Apakah ingin mengulang program? (y/n): ");
    ulang = in.next().charAt(0);

} while (ulang == 'y' || ulang == 'Y');

in.close(); // Menutup scanner untuk mencegah memory leak
    }
}
