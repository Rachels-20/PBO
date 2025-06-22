/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3K13;

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
        Scanner get = new Scanner (System.in);
        int pilih;
        char ulang;
        do{
        System.out.println("Bangun datar");
        System.out.println("1. Rectangle\n2. Circle");
        System.out.print("Pilih bangun datar ");
        
        pilih = get.nextInt();
        
        switch(pilih){
            case 1:{
                System.out.println("\nRectangle");
                System.out.print("Masukkan panjang sisi ");
                double length=get.nextDouble();
                System.out.print("Masukkan lebar sisi ");
                double width=get.nextDouble();
                Rectangle r1= new Rectangle(width,length);
                System.out.println("\n===============================================");
                System.out.println(r1.toString());
                System.out.println("Rectangle [Area="+r1.getArea()+" cm, Perimeter="+r1.getPerimeter()+" cm]");
                System.out.println("===============================================");
                break;
            }
            
            case 2:{
                System.out.println("\nCircle");
                System.out.print("Masukkan panjang radius ");
                double radius=get.nextDouble();
                Circle c1= new Circle(radius);
                System.out.println("\n===============================================");
                System.out.println(c1.toString());
                System.out.println("Circle [Area="+c1.getArea()+" cm, Perimeter="+c1.getPerimeter()+" cm]");
                System.out.println("===============================================");
                break;
            }
            
            default:{
                System.out.println("Pilihan anda salah");
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
