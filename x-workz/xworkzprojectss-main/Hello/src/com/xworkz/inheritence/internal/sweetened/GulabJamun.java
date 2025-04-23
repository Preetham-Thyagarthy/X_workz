package com.xworkz.inheritence.internal.sweetened;

public class GulabJamun extends Sweetened {
    public GulabJamun() {
        super();
        System.out.println("Running non-arg constructor GulabJamun");
    }
    @Override
    public void taste() {
        System.out.println("Delicious to eat");
    }
    @Override
    public void madeWithSugar() {
        System.out.println("Often made with sugar");
    }
    @Override
    public void serveInFestivals() {
        System.out.println("Served during festivals");
    }
    @Override
    public void store() {
        System.out.println("Stored for a few days");
    }
    @Override
    public void giftToOthers() {
        System.out.println("Commonly given as gifts");
    }
}
