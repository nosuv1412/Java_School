/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.*;

/**
 *
 * @author Hien Vu
 */
public class DemoBoxLayout extends JFrame {
    public DemoBoxLayout(){
        setTitle("BoxLayout");
        setSize(450,250);	
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);	
        setResizable(false);	
        Box	bv,bh1,bh2,bv1;
        add(bv=Box.createVerticalBox());
        bv.add(bh1=Box.createHorizontalBox());
        bv.add(bh2=Box.createHorizontalBox());
        bv.add(bv1=Box.createVerticalBox());
        for(int i=0;i<3;i++){
            bh1.add(Box.createHorizontalGlue());
            bh1.add(new JButton("Button	"+i));
        }
        bh1.add(Box.createHorizontalGlue());
        for (int i=0;i<	5;i++){
            bh2.add(new JButton("Button	"+i));
        }
        for (int i=0;i<5;i++){
            bv1.add(Box.createVerticalStrut(5));
            bv1.add(new JButton("Button	"+i));
        }
        bv1.add(Box.createVerticalStrut(5));
    }
    public static void main(String[]args)	{
        new DemoBoxLayout().setVisible(true);
    }
}
