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
public class Lingkaran {
    double r;
    
    public Lingkaran(){
        
    }
    
    public Lingkaran(double r){
        this.r=r;
    }
    
    public void setR(double r){
        this.r=r;
    }
    
    public double getR(){
        return r;
    }
    
    public double getDiameter(){
        return 2*r;
    }
    
    public double getKeliling(){
        return 3.14*2*r;
    }
    
    public double getLuas(){
        return 3.14*r*r;
    }
    
    public String toString(){
        return "lingkaran dengan jari-jari ="+r+"\nDiameter = "+getDiameter()+"\nKeliling Lingkaran = "+getKeliling()+"\nLuas Lingkaran = "+getLuas();
    }
    
}
