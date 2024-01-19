/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab08;

/**
 *
 * @author Hien Vu
 */
public class Circle {
    private double radius ;
    private String color = "red";
    
    Circle(){
       this.radius = 1.0; 
    }
    
    Circle(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    public String toString(){
        return "Radius: "+this.radius;
    }
    
}
