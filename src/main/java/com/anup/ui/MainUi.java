package com.anup.ui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainUi {

    public static void main(String[] args) {
        //Frame
        JFrame myFrame = new JFrame();
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(500, 500);

        //Image
        ImageIcon icon = new ImageIcon(".\\src\\main\\resources\\icon1.jpg");

        //Border for label
        Border border = BorderFactory.createLineBorder(Color.green,3);
        Border border2 = BorderFactory.createLineBorder(Color.YELLOW,3);
        //Label1
        JLabel label1 = new JLabel("Bro, do you even code");
        label1.setIcon(icon);
        label1.setHorizontalTextPosition(JLabel.CENTER);  //LEFT, CENTER, RIGHT
        label1.setVerticalTextPosition(JLabel.TOP);
        label1.setIconTextGap(30);
        label1.setForeground(Color.GREEN);
        label1.setBackground(Color.BLACK);
        label1.setOpaque(true);
        label1.setBorder(border);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(0,0,250,250);


        //Label1
        JLabel label2 = new JLabel("Yes I do");
        label2.setIcon(icon);
        label2.setHorizontalTextPosition(JLabel.CENTER);  //LEFT, CENTER, RIGHT
        label2.setVerticalTextPosition(JLabel.TOP);
        label2.setIconTextGap(30);
        label2.setForeground(Color.GREEN);
        label2.setBackground(Color.BLACK);
        label2.setOpaque(true);
        label2.setBorder(border2);
        label2.setVerticalAlignment(JLabel.CENTER);
        label2.setHorizontalAlignment(JLabel.CENTER);

        //add label to frame
        myFrame.add(label1);
        myFrame.add(label2);
        //myFrame.setLayout(null);
        myFrame.setIconImage(icon.getImage());
        myFrame.pack();
    }
}
