/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_lab04;

/**
 *
 * @author Hien Vu
 */
public class Java_Lab04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         MyPoint[] points =new MyPoint[10];
//            for(int i=1;i<10;i++)
//                points[i]=new MyPoint(i,i);
//    MyPoint p1 = new MyPoint(3, 0);
//    MyPoint p2 = new MyPoint(0, 4);
//    System.out.println(p1.distance(p2));
//    System.out.println(p1.distance(5, 6));
    MyCircle c1 = new MyCircle(3, 0, 3);
    System.out.println("Circle c1: "+ c1);
    c1.setRadius(5);
    System.out.println("Radius of circle c1 now is "+ c1.getRadius());
    c1.setCenter(new MyPoint(4,4));
    System.out.println("Center of circle c1 now is "+ c1.getCenter());
    System.out.println("Area of circle c1 is "+ c1.getArea());
    }
    
}
