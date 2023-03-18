package com.example;

public class BadBonus {
    public double getBonusPercent(Employee e)
    {
        return  0.01;
    }
    public double getBonusPercent(Manager m)
    {
        return  0.03;
    }
    public double getBonusPercent(Director d)
    {
        return  0.05;
    }

}
