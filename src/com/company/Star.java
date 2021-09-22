package com.company;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class Star {
    float r,k,b;
    int x, y, width, height;
    Random random = new Random();

    public Star(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        int xPoints[] = {9, 15, 0, 18, 3};
        int yPoints[] = {0, 18, 6, 6, 18};

        Graphics2D g2d = (Graphics2D) g;
        GeneralPath star = new GeneralPath();

        star.moveTo(xPoints[0] + x, yPoints[0] + y);
        for (int i = 1; i < xPoints.length; i++) {
            star.lineTo(xPoints[i] + x, yPoints[i] + y);
        }
        star.closePath();
//to get rainbow, pastel colors

        final float hue = random.nextFloat();
        final float saturation = 0.9f;//1.0 for brilliant, 0.0 for dull
        final float luminance = 1.0f; //1.0 for brighter, 0.0 for black
        g2d.setColor(Color.getHSBColor(hue,saturation,luminance));
        g2d.fill(star);
    }

}
