package com.example.conc;

import com.example.abst.SalesCalc;

public class WidgetPro extends Widget{
    private String type;

    public WidgetPro() {
    }

    public WidgetPro(String type) {
        this.type = type;
    }

    public WidgetPro(double salesPrice, double cost, double quantity) {
        super(salesPrice, cost, quantity);
    }

    public WidgetPro(String name, double salesPrice, double cost, double quantity, String type) {
        super(name, salesPrice, cost, quantity);
        this.type = type;
    }
}
