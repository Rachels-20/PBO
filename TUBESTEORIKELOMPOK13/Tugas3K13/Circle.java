/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3K13;

/**
 *
 * @author akels
 */
public class Circle implements GeometricObject{
    private double radius;
    
    public Circle(double radius){
        this.radius=radius;
    }
    
    @Override
    public String toString(){
        return "Circle [radius="+radius+"]";
    }
    
    @Override
    public double getArea(){
        return 3.14*radius*radius;
    }
    
    @Override
    public double getPerimeter(){
        return 2*3.14*radius;
    }
    
}
