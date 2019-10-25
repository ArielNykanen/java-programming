package com.company;

public class Wall {
    private double width;
    private double height;

    public Wall() {
        this(0, 0);
    }

    public Wall(double width, double height) {
        setHeight(height);
        setWidth(width);
    }

    public double getArea() {
        double area = this.width * this.height;
        return area;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            width = 0;
        }

        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            height = 0;
        }

        this.height = height;
    }
}
