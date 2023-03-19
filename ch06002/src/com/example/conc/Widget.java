package com.example.conc;

import com.example.abst.SalesCalc;

public class Widget implements SalesCalc {
    private String name;
    private double salesPrice = 0;
    private double cost = 0;
    private double quantity= 0; // In per item

    public Widget() {
    }

    public Widget(double salesPrice, double cost, double quantity) {
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.quantity = quantity;
    }

    public Widget(String name, double salesPrice, double cost, double quantity) {
        this.name = name;
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    @Override
    public double calcSalesPrice() {
        return this.cost*this.quantity*0.2;
    }

    @Override
    public double calcCost() {
        return this.cost*this.quantity;
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

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
