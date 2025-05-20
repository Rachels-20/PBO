/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum22042025;

/**
 *
 * @author akels
 */
public class Silinder extends Lingkaran {
    private double tinggi;
    
    public Silinder(){
        super();
    }
    
    public Silinder(double r, double t){
        super(r);
        this.tinggi=t;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi=tinggi;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public double getVolume(){
        double r=getR();
        return 3.14*r*tinggi;
    }
    
    @Override
    public String toString(){
        return "jari-jari silinder adalah "+r+" tinggi silinder adalah "+tinggi;
    }
    
    public double getLuas(){
        return getVolume();
    }
    
}
