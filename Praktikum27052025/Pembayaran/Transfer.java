/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum27052025.Pembayaran;

import Praktikum27052025.Pembayaran.MetodePembayaran;

/**
 *
 * @author akels
 */
public class Transfer extends MetodePembayaran{
    public String bank;
    
    public Transfer(String namaPemilik, String bank) {
        super(namaPemilik);
        this.bank = bank;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Transfer via " + bank + " oleh " + namaPemilik + " sebesar Rp. " + jumlah);
    }
    
}
