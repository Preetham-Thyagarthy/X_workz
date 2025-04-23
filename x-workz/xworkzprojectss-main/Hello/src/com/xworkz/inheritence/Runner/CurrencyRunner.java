package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.currency.Currency;
import com.xworkz.inheritence.internal.currency.Dollar;
import com.xworkz.inheritence.internal.currency.Rupees;

public class CurrencyRunner {
    public static void main(String[] args) {

        Currency currency = new Currency();
        currency.value();
        currency.exchangeRate();
        currency.country();
        currency.symbol();
        currency.usedForTrade();
        System.out.println("**************************************");
        Currency currency1 = new Dollar();
        currency1.value();
        currency1.exchangeRate();
        currency1.country();
        currency1.symbol();
        currency1.usedForTrade();

        System.out.println("**************************************");

        Dollar dollar = new Dollar();
        dollar.value();
        dollar.exchangeRate();
        dollar.country();
        dollar.symbol();
        dollar.usedForTrade();

        System.out.println("************Casting example**************");
        Rupees rupees=new Rupees();
        rupees.verify(currency);
        rupees.verify(currency1);
        rupees.verify(dollar);
    }
}
