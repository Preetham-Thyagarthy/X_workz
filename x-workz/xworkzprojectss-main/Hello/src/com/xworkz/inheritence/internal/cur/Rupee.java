package com.xworkz.inheritence.internal.cur;

public class Rupee {
    public void checkCurrency(Currency currency) {
        currency.value();
        currency.exchangeRate();
        currency.symbol();
        currency.usage();

        if (currency instanceof Dollar) {
            System.out.println("Currency is an instance of Dollar");
            Dollar dollar = (Dollar) currency;
            dollar.exchangemoney();
        }
    }
}
