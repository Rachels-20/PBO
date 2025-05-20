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
public class Laptop extends Elektronik {
    private int ukuranLayar;
    private int kapasitasRAM;
    
    public Laptop(){
        super();
    }
    
    public int getUkuranLayar(){
        return ukuranLayar;
    }
    
    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar=ukuranLayar;
    }
    
    public int getKapasitasRAM(){
        return kapasitasRAM;
    }
    
    public void setKapasitasRAM(int kapasitasRAM){
        this.kapasitasRAM=kapasitasRAM;
    }
    
    @Override
    public void display(){
        System.out.println("Kelas Laptop");
        System.out.println("Merek : "+super.getMerek());
        System.out.println("Tahun Produksi : "+super.getTahunProduksi());
        System.out.println("Garansi : "+super.getGaransi());
        System.out.println("Ukuran Layar : "+this.ukuranLayar+"inch");
        System.out.println("Kapasitas RAM : "+this.kapasitasRAM+"GB");
    }
}
