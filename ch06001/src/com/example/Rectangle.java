package com.example;

public class Rectangle implements Shape{

    private double width;
    private  double lenght;

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return width*lenght;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+lenght);
    }
}
