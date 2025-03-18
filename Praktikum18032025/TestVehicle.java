/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum18032025;

/**
 *
 * @author akels
 */
public class TestVehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //buat vehicle dengan beban maksimal 10000kg
        System.out.println("Kendaraan 1. Beban maksial 10.000kg");
        Vehicle kendaraan1= new Vehicle(10000);
        
        //menambahkan beberapa beban (load)
        System.out.println("Menambahkan beban 1(500kg)");
        kendaraan1.load=kendaraan1.load+500;
        System.out.println("Menambahkan beban 2(250kg)");
        kendaraan1.load=kendaraan1.load+250;
        System.out.println("Menambahkan beban 3(5000kg)");
        kendaraan1.load=kendaraan1.load+5000;
        System.out.println("Menambahkan beban 4(4000kg)");
        kendaraan1.load=kendaraan1.load+4000;
        System.out.println("Menambahkan beban 5(350kg)");
        kendaraan1.load=kendaraan1.load+350;
        
        //menampilkan beban/load dari kendaraan saat ini
        System.out.println("Beban kendaraan saat ini = " +kendaraan1.getLoad()+"kg");
    }
    
}
