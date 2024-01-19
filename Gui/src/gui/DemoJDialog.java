/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import javax.swing.JDialog;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Hien Vu
 */
public class DemoJDialog extends JFrame{
     public DemoJDialog(){
            setTitle("Demo JDialog");            
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setSize(300,200);
            setResizable(false);
        }
     public static void main(String[] args) {
        // TODO code application logic here
        new DemoJDialog().setVisible(true);
    }
}
