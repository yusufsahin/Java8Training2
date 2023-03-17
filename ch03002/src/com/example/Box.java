package com.example;

public class Box {
    private double lenght,width,height;


    public Box() {
        this.lenght=1;
        this.width=1;
        this.height=1;
    }

    public Box(double lenght) {
       this.height=this.width= this.lenght = lenght;
    }

    public Box(double lenght, double width, double height) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume(){
        return  width*height*lenght;
    }
}
