package com.test;

public enum Currency {
    USD("United States Dollar", "$","USD"),
    EUR("Euro", "€","EUR"),
    GBP("British Pound Sterling", "£","GBP"),
    JPY("Japanese Yen", "¥","JPY");

    private String name;
    private String symbol;

    private String shortForm;
    private Currency(String name, String symbol,String shortForm) {
        this.name = name;
        this.symbol = symbol;
        this.shortForm=shortForm;
    }
    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getShortForm() {
        return shortForm;
    }
}
