package com.example.conc;

import com.example.abst.SalesCalc;

public class RedPaint implements SalesCalc {
    private String name;
    private double salesPrice = 0;
    private double cost = 0;
    private double gallons = 0; // In gallons

    public RedPaint() {
    }

    public RedPaint(double salesPrice, double cost, double gallons) {
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.gallons = gallons;
    }

    public RedPaint(String name, double salesPrice, double cost, double gallons) {
        this.name = name;
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.gallons = gallons;
    }

    public String getName() {
        return name;
    }

    @Override
    public double calcSalesPrice() {
        return this.salesPrice * this.gallons* 0.3 ;
    }

    @Override
    public double calcCost() {
        return this.cost*this.gallons;
    }

    @Override
    public double calcProfit() {
        return this.calcSalesPrice()-this.calcCost();
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getGallons() {
        return gallons;
    }

    public void setGallons(double gallons) {
        this.gallons = gallons;
    }
}
