package com.example;

public class GoodBonus {
    public  static  double getBonusPercent(Employee e)
    {
        if(e instanceof Director){
            return  0.04;
        } else if (e instanceof Manager) {
            return  0.03;
        }
        else {
            return  0.01;
        }
    }

}
