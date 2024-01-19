/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab04;

/**
 *
 * @author Hien Vu
 */
public class MyCircle {
    private MyPoint center;
    private int radius=1;

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }
    
    public MyCircle(MyPoint center,int radius) {
        this.center = center;
        this.radius=radius;
    }
    
    public int getRadius(){
        return this.radius;
    }
    
    public void setRadius(int radius){
        this.radius=radius;
    }
    
    public MyPoint getCenter(){
        return this.center;
    }
    
    public void setCenter(MyPoint center){
        this.center=center;
    }
    
     public int getCenterX() {
        return this.center.getX();
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }
    
    public String toString() {
        return "Circle: "+this.center+" radius: "+this.radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
