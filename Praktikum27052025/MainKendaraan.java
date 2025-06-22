/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum27052025;

/**
 *
 * @author akels
 */
public class MainKendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil mobil = new Mobil("Toyota Avanza", 2022, 4, "Automatic");
        Motor motor = new Motor("Yamaha NMAX", 2023,  "Full Face", 160 );
        
        mobil.nyalakan();
        mobil.info();
        mobil.periksaKondisi();
        mobil.servis();
        mobil.matikan();
        
        System.out.println();
        
        motor.nyalakan();
        motor.info();
        motor.periksaKondisi();
        motor.servis();
        motor.matikan();
    }
    
}
