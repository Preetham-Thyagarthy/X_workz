package com.xworkz.inheritence.internal.currency;

public class Dollar extends Currency {
    public Dollar() {
        super();
        System.out.println("Running non-arg constructor Dollar");
    }
    @Override
    public void value() {
        System.out.println("Monetary value");
    }
    @Override
    public void exchangeRate() {
        System.out.println("Exchange rate");
    }
    @Override
    public void symbol() {
        System.out.println("Unique symbol");
    }
    @Override
    public void usedForTrade() {
        System.out.println("Used for trade");
    }
    public void exchange(){
        System.out.println("Exchange of rupees to dollers");
    }
}
