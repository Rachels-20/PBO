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
public class Hewan {
    protected String nama;
    
    public Hewan(String nama){
        this.nama=nama;
    }
    
    public void Suara(){
        System.out.println("Suara hewan...");
    }
    
    public void tampilkanNama(){
        System.out.println("Nama hewan "+nama);
    }
}
