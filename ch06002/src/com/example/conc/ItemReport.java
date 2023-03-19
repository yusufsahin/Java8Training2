package com.example.conc;

import com.example.abst.SalesCalc;

public class ItemReport {

    public void printItemData(SalesCalc salesCalc)
    {
        System.out.println(salesCalc.getName()+"-"+salesCalc.calcSalesPrice()+"-"+salesCalc.calcCost()+"-"+salesCalc.calcProfit());
    }
}
