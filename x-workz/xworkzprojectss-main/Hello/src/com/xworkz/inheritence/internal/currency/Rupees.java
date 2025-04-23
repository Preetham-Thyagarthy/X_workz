package com.xworkz.inheritence.internal.currency;

public class Rupees {
    public void verify(Currency currency) {
        currency.value();
        currency.exchangeRate();
        currency.symbol();
        currency.usedForTrade();

        if (currency instanceof Dollar) {
            System.out.println("Currency is an instance of Dollar");
            Dollar dollar = (Dollar) currency;
            dollar.exchange();
        }
    }

}
