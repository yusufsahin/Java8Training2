package com.example;

//public class Square extends Rectangle

public class Square extends Shape{

    private double dim;

    protected Square(String color,double dim) {
        super(color);
        this.dim=dim;
    }

    @Override
    public double area() {
        return dim*dim;
    }

    @Override
    public String toString() {
       return "Rectangle of length " + dim + " and width " + dim + " with color " + color;
    }
}
