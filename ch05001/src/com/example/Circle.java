package com.example;

public class Circle extends Shape{
    private  double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
      return "Circle of radius " + radius + " with color " + color;
    }
}
