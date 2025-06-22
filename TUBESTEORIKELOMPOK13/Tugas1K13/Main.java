/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1K13;

import java.util.Scanner;

/**
 *
 * @author akels
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner get = new Scanner(System.in);
        int pilih;
        double radius, side, length, width;
        char ulang;
        String color;
        boolean filled;
        
        do{
        System.out.println("===Menu Bentuk====");
        System.out.println("1. Lingkaran\n2. Persegi Panjang\n3. Persegi");
        System.out.print("\nPilih Bangun ");
        pilih=get.nextInt();
        switch(pilih){
            case 1:{
                Circle c1=new Circle();
                System.out.println();
                System.out.println("Lingkaran");
                System.out.print("Masukkan warna lingkaran ");
                get.nextLine();
                color=get.nextLine();
                c1.setColor(color);
                System.out.print("Apakah lingkaran berisi? (true/false) ");
                filled=get.nextBoolean();
                c1.setFilled(filled);
                System.out.print("Masukkan panjang jari-jari lingkaran ");
                radius=get.nextDouble();
                c1.setRadius(radius);
                System.out.println();
                System.out.println("====================Lingkaran====================");
                System.out.println(c1.toString());
                System.out.println("=================================================");
                break;
            }
            case 2:{
                Rectangle r1=new Rectangle();
                System.out.println();
                System.out.println("Persegi Panjang");
                System.out.print("Masukkan warna Persegi Panjang ");
                get.nextLine();
                color=get.nextLine();
                r1.setColor(color);
                System.out.print("Apakah persegi panjang berisi? (true/false) ");
                filled=get.nextBoolean();
                r1.setFilled(filled);
                System.out.print("Masukkan panjang sisi persegi panjang ");
                width=get.nextDouble();
                r1.setWidth(width);
                System.out.print("Masukkan lebar sisi persegi panjang ");
                length=get.nextDouble();
                r1.setLength(length);
                System.out.println();
                System.out.println("==================Persegi Panjang==================");
                System.out.println(r1.toString());
                System.out.println("===================================================");
                break;
            }
            case 3:{
                Square q1=new Square();
                System.out.println();
                System.out.println("Persegi");
                System.out.print("Masukkan warna Persegi ");
                get.nextLine();
                color=get.nextLine();
                q1.setColor(color);
                System.out.print("Apakah persegi berisi? (true/false) ");
                filled=get.nextBoolean();
                q1.setFilled(filled);
                System.out.print("Masukkan panjang sisi persegi ");
                side=get.nextDouble();
                q1.setSide(side);
                System.out.println();
                System.out.println("=====================Persegi=====================");
                System.out.println(q1.toString());
                System.out.println("=================================================");
                break;
            }
            default:{
                System.out.println("Pilihan anda salah!");
                break;
            }
        }
        get.nextLine();
        System.out.println();
        System.out.print("Apakah anda ingin mengulang? (y/n) ");
        ulang=get.nextLine().charAt(0);
        }while(ulang=='Y'||ulang=='y');
        
    }
    
}
