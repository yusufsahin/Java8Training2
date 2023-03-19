package com.example.conc;

import com.example.abst.SalesCalc;
import com.example.abst.TotalCostBenefit;

public class ConcTotalCostBenefit implements TotalCostBenefit {
    @Override
    public void TotalReport(SalesCalc[] salesCalc) {
        double totalSales=0;
        double totalCost=0;
        double totalProfit=0;
        for (SalesCalc item:salesCalc) {
             totalSales+=item.calcSalesPrice();
             totalCost+=item.calcCost();
             totalProfit+=item.calcProfit();

        }

        System.out.println("Total Sales: "+totalSales+"-"+"Total cost: "+ totalCost+"-"+"Total Profit"+totalProfit);
    }
}
