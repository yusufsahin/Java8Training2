package com.example;

public final class Rectangle extends Shape {

    private  double length;
    private  double width;

    public Rectangle(String color, double lenght, double width) {
        super(color);
        this.length = lenght;
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle of length " + length + " and width " + width + " with color " + color;
    }
}
