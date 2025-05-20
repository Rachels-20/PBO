/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum14052025;

/**
 *
 * @author akels
 */
public class PesawatMain {
    public static void main(String[] args){
        Pesawat p=new Pesawat("Lion Air", 2010, true, 120);
        p.cetak();
        
        System.out.println("Setelah reset");
        p.Reset("Airbus",2016,false,200);
        p.cetak();
    }
}
