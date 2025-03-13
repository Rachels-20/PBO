/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum110325;

/**
 *
 * @author akels
 */
public class AksiMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil mobilku= new Mobil();
        mobilku.merk="Toyota";
        mobilku.plat="BA 1234 L";
        mobilku.tahun=2004;
        mobilku.warna="HItam";
        System.out.println("Data Mobil 1");
        System.out.println("---------");
        System.out.println("Merk Mobil = "+mobilku.merk);
        System.out.println("Plat mobil = "+mobilku.plat);
        System.out.println("Tahun keluaran= "+mobilku.tahun);
        System.out.println("Warna mobil= "+mobilku.warna);
        System.out.println(mobilku.SuaraMobil());
        mobilku.MobilAktif();
        
        System.out.println();
        
        Mobil mobilnya= new Mobil();
        mobilnya.merk="Mitsubishi";
        mobilnya.plat="BA 2345 L";
        mobilnya.tahun=2005;
        mobilnya.warna="Putih";
        System.out.println("Data Mobil 2");
        System.out.println("---------");
        System.out.println("Merk Mobil = "+mobilnya.merk);
        System.out.println("Plat mobil = "+mobilnya.plat);
        System.out.println("Tahun keluaran= "+mobilnya.tahun);
        System.out.println("Warna mobil= "+mobilnya.warna);
    }
    
}
