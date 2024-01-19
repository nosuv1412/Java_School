/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab04;

/**
 *
 * @author Hien Vu
 */
public class MyPoint {
    private int x = 0;
    private int y = 0;
    MyPoint(){};
    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    public String Tostring(){
        return "("+this.x+";"+this.y+")";
    }
    public double distance(int x, int y) {
        int xDiff = this.y - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;      
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}
