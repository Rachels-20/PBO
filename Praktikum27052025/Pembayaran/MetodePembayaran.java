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
public abstract class MetodePembayaran {
    protected String namaPemilik;

    public MetodePembayaran(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public abstract void prosesPembayaran(double jumlah);
}
