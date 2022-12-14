package com.anup.ui.frames;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(){
        //jframe a gui windown to add components to
        this.setTitle("JFrame Title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setResizable(false);
        this.setVisible(true);

        ImageIcon icon = new ImageIcon(".\\src\\main\\resources\\icon1.jpg");

        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(177,187,186));
    }
}
