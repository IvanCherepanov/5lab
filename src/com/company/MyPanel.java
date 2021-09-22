package com.company;

import java.awt.*;

public class MyPanel extends Panel {
    int x =10;
    int y = 10;
    public void paintComponent(Graphics g)
    {
        g.drawLine(x, y, 130, 140);
    }
}
