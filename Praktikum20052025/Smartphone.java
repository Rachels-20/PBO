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
public class Smartphone extends Elektronik {
    private int kapasitasBaterai;
    private int jumlahKamera;
    
    public Smartphone(){
        super();
    }
    
    public int getKapasitasBaterai(){
        return kapasitasBaterai;
    }
    
    public void setKapasitasBaterai(int kapasitasBaterai){
        this.kapasitasBaterai=kapasitasBaterai;
    }
    
    public int getJumlahKamera(){
        return jumlahKamera;
    }
    
    public void setJumlahKamera(int jumlahKamera){
        this.jumlahKamera=jumlahKamera;
    }
    
    @Override
    public void display(){
        System.out.println("Kelas Smartphone");
        System.out.println("Merek : "+super.getMerek());
        System.out.println("Tahun Produksi : "+super.getTahunProduksi());
        System.out.println("Garansi : "+super.getGaransi());
        System.out.println("Kapasitas Baterai : "+this.kapasitasBaterai+"mAh");
        System.out.println("Jumlah Kamera : "+this.jumlahKamera);
    }
}
