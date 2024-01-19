/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Hien Vu
 */
public class Gui extends JFrame{
        public Gui(){
            setTitle("FlowLayout");
            setSize(300,250);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setResizable(false);
            
            setLayout(new FlowLayout());
            for (int i =1; i<=20; i++){
                add(new JButton("Button"+i));
            }
        }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Gui().setVisible(true);
    }
    
}
