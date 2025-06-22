/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1K13;

/**
 *
 * @author akels
 */
public class Rectangle extends Shape{
    private double width=1.0;
    private double length=1.0;
    
    public Rectangle(){
        
    }
    
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width=width;
    }
    
    public double getLength(){
        return length;
    }
    
    public void setLength(double length){
        this.length=length;
    }
    
    public double getArea(){
        return width*length;
    }
    
    public double getPerimeter(){
        return 2*width+2*length;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nIni berbentuk persegi panjang,\ndengan panjang sisi "
                +width+", dan lebar sisi "+length+"\nMemiliki luas "+
                getArea()+" cm, serta keliling "+getPerimeter()+" cm";
    }
    
}
