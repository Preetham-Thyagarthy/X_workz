package com.xworkz.inheritence.internal.drink;

public class Juice extends Drink {
    public Juice() {
        super();
        System.out.println("Running non-arg constructor Juice");
    }
    @Override
    public void sip() {
        System.out.println("Sipped");
    }
    @Override
    public void refresh() {
        System.out.println("Refreshing");
    }
    @Override
    public void cold() {
        System.out.println("Can be cold");
    }
    @Override
    public void sweet() {
        System.out.println("Can be sweet");
    }
    @Override
    public void healthy() {
        System.out.println("Is healthy");
    }
    public void taste(){
        System.out.println("Taste is sour and sweet");
    }
}
