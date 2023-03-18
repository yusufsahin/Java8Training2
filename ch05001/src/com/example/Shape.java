package com.example;

public abstract class Shape {

    protected String color;

    protected Shape(String color)
    {
        this.color=color;
    }

    public abstract double area();

    public abstract  String toString();

    public  String getColor()
    {
        return  color;
    }
}
