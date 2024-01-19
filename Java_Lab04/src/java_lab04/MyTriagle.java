/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab04;

/**
 *
 * @author Hien Vu
 */
public class MyTriagle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    public MyTriagle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }
    
    public MyTriagle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v1 = v2;
        this.v3 = v3;
    }
   
    public String Tostring(){
        return "Triangle: "+ v1 +", "+ v2 +", "+ v3;
    }
    
    public double getPerimeter(){
         return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }
}
