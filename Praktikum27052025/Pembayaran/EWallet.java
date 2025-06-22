/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum27052025.Pembayaran;

/**
 *
 * @author akels
 */
public class EWallet extends MetodePembayaran{
    
    private String provider;

    public EWallet(String namaPemilik, String provider) {
        super(namaPemilik);
        this.provider = provider;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran E-Wallet (" + provider + ") oleh " + namaPemilik + " sebesar Rp. " + jumlah);
    }
    
}
