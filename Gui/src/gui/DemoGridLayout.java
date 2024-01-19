/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author Hien Vu
 */
public class DemoGridLayout extends JFrame{
    public DemoGridLayout()	{
        setTitle("GridLayout");
        setSize(300,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new GridLayout(7,3,5,5));
        for (int i=1;i<=20;i++)	{
            add(new JButton("Button	"+i));
        }
    }
    public static void main(String[]	args)	{
        new DemoGridLayout().setVisible(true);
    }
}
