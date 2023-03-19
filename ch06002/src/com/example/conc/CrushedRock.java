package com.example.conc;

import com.example.abst.SalesCalc;

public class CrushedRock implements SalesCalc {
    private String name;
    private double salesPrice = 0;
    private double cost = 0;
    private double weight = 0; // In pounds


    public CrushedRock() {
    }

    public CrushedRock(double salesPrice, double cost, double weight) {
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.weight = weight;
    }

    public CrushedRock(String name, double salesPrice, double cost, double weight) {
        this.name = name;
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public double calcSalesPrice() {
        return this.salesPrice *  this.weight * 0.5;
    }

    @Override
    public double calcCost() {
        return this.cost*this.weight;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
