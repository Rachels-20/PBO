/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum11032025;

/**
 *
 * @author akels
 */
public class Kendaraan {
    String jenis;
    String merk;
    int tahun;
    String warna;
    
    //constructor
    public Kendaraan(String j, String m, int t, String w){
        this.jenis=j;
        this.merk=m;
        this.tahun=t;
        this.warna=w;
    }
    
    //method tanpa parameter
    public void InfoKendaraan(){
        System.out.println("Data Kendaraan");
        System.out.println("---------------");
        System.out.println("Jenis Kendaraan = "+jenis);
        System.out.println("Merk Kendaraan = "+merk);
        System.out.println("Tahun Keluaran = "+tahun);
        System.out.println("Warna Kendaraan = "+warna);
    }
    
    //method dengan parameter
    public void CekHarga(int harga){
        System.out.println("Harga Sewa Kendaraan Rp."+harga);
    }
    
    public void Speed(int v){
        if(v>=20 && v<=40){
            System.out.println("Kecepatan anda slow");
        }
        else if(v>=41 && v<=60){
            System.out.println("Kecepatan anda medium");
        }
        else if(v>=61 && v<=85){
            System.out.println("Kecepatan anda fast");
        }
        else if(v>85){
            System.out.println("Kecepatan anda racing");
        }
        else{
            System.out.println("kecepatan anda terlalu lambat");
        }
    }
}
