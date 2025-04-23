package com.xworkz.inheritence.internal.cur;

public class Dollar extends Currency{
    public Dollar() {
        super();
        System.out.println("Running non-arg constructor of Dollar");
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
    public void usage() {
        System.out.println("Used for trade and transactions");
    }
    public void exchangemoney(){
        System.out.println("Exchange of rupees to dollers");
    }
}
