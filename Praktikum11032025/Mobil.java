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
public class Mobil {
    ///property dari class Mobil
    String warna;
    String plat;
    int tahun;
    String merk;
    
    String SuaraMobil(){
        return "Brumm";
    }
    public void MobilAktif(){
        System.out.println("3..2..1");
        System.out.println("Ready..GO!");
    }
}
