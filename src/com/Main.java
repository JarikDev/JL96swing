package com;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      /*  jFrame.setSize(300,300);
        jFrame.setLocation(300,300);*/
        Toolkit toolkit=Toolkit.getDefaultToolkit();

        Dimension dimension=toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250,dimension.height/2-150,500,500);
        jFrame.setTitle("Title");

    }
}
