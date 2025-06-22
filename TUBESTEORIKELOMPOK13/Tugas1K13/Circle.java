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
public class Circle extends Shape{
    private double radius=0.1;
    
    public Circle(){
        
    }
    
    public Circle(double radius){
        this.radius=radius;
    }
    
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius=radius;
    }
    
    public double getArea(){
        return 3.14*radius*radius;
    }
    
    public double getPerimeter(){
        return 2*3.14*radius;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nIni berbentuk lingkaran dengan jari-jari "+getRadius()+
                ".\nMemiliki luas "+getArea()+" cm, dan keliling "+getPerimeter()+" cm.";
    }
}
