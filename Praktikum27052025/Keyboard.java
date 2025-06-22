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
public class Keyboard extends AlatMusik implements BisaDinyalakan{
    private boolean dayaTersambung;
    
    public Keyboard(String nama, String jenis, boolean dayaTersambung){
        super(nama, jenis);
        this.dayaTersambung=dayaTersambung;
    }
    
    @Override
    public void nyalakan(){
        if(cekListrik()){
            System.out.println(nama+" dinyalakan.");
        }else{
            System.out.println(nama+" tidak bisa dinyalakan");
        }
    }
    
    @Override
    public void matikan(){
        System.out.println(nama+" dimatikan.");
    }
    
    @Override
    public boolean cekListrik(){
        return dayaTersambung;
    }
    
    public void mainkan(){
        System.out.println(nama+" dimainkan dengan menekan tuts");
    }
    
    public void stem(){
        System.out.println("Keyboard "+nama+" distem digital melalui aplikasi");
    }
    
    
    
    
    
}
