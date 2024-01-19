/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

/**
 *
 * @author Hien Vu
 */
public class Shape {
    
    private String  color   = "red";
    private boolean filled  = true;


    public Shape() {}

    public Shape(String color, boolean filled) {
        this.color  = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color= color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String ToString(){
        return "A Shape with color of "+ color +" and "+ (isFilled()? "filled" : "not filled");
    }
    
}

