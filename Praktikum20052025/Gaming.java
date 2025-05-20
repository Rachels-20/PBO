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
public class Gaming extends Laptop {
    private String kartuGrafis;
    private int refreshRate;
    
    public Gaming(){
        super();
    }
    
    public String getKartuGrafis(){
        return kartuGrafis;
    }
    
    public void setKartuGrafis(String kartuGrafis){
        this.kartuGrafis=kartuGrafis;
    }
    
    public int getRefreshRate(){
        return refreshRate;
    }
    
    public void setRefreshRate(){
        this.refreshRate=refreshRate;
    }
    
    public void display(){
        System.out.println("Kelas Laptop Gaming");
        System.out.println("Merek : "+super.getMerek());
        System.out.println("Tahun Produksi : "+super.getTahunProduksi());
        System.out.println("Garansi : "+super.getGaransi());
        System.out.println("Ukuran Layar : "+super.getUkuranLayar()+"inch");
        System.out.println("Kapasitas RAM : "+super.getKapasitasRAM()+"GB");
        System.out.println("Kartu Grafis : "+this.kartuGrafis);
        System.out.println("Refresh Rate : "+this.refreshRate);
    }
}
