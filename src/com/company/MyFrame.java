package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel panel;
    public MyFrame()
    {
        setSize(200,200);
        panel= new MyPanel();
        add(panel);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graphic2d = (Graphics2D) g;
        graphic2d.setColor(Color.BLUE);
        graphic2d.fillRect(100, 50, 60, 80);
    }
}
