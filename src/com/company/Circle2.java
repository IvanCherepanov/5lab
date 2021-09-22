package com.company;

public class Circle2 extends Shape{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle2(String color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }
}
