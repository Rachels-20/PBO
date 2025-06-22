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
public class KartuKredit extends MetodePembayaran {

    private String nomorKartu;

    public KartuKredit(String namaPemilik, String nomorKartu) {
        super(namaPemilik);
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran dengan kartu kredit (" + nomorKartu + ") oleh " + namaPemilik + " sebesar Rp. " + jumlah);
    }

}
