/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum20052025;

/**
 *
 * @author akels
 */
public class TestPolymorfism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objek biasa
        Elektronik barang1 = new Elektronik();
        barang1.setMerek("samsung");
        barang1.setTahunProduksi(2025);
        barang1.setGaransi(3);
        barang1.display();
        
        System.out.println();
        
        SmartWatch barang2 = new SmartWatch();
        barang2.setMerek("Xiaomi");
        barang2.setTahunProduksi(2023);
        barang2.setGaransi(1);
        barang2.setKapasitasBaterai(1000);
        barang2.setJumlahKamera(2);
        barang2.setUkuranLayar(400);
        barang2.setTahanAir(true);
        barang2.display();
        
        System.out.println();
        
        //polymorfism
        Elektronik barang3 = new Laptop();
        barang3.setMerek("HP");
        barang3.setTahunProduksi(2023);
        barang3.setGaransi(2);
        ((Laptop)barang3).setUkuranLayar(14);
        ((Laptop)barang3).setKapasitasRAM(32);
        barang3.display();
        
        System.out.println();
        
        Smartphone barang4 = new SmartWatch();
        barang4.setMerek("Apple");
        barang4.setTahunProduksi(2024);
        barang4.setGaransi(1);
        barang4.setKapasitasBaterai(1000);
        barang4.setJumlahKamera(1);
        ((SmartWatch)barang4).setUkuranLayar(300);
        ((SmartWatch)barang4).setTahanAir(true);
        barang4.display();
        //Smartphone barang4 = new SmartWatch("Apple", 2025, 3, 1500, 1, , 2, true);
        
    }
    
}
