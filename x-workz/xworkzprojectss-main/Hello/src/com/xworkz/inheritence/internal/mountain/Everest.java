package com.xworkz.inheritence.internal.mountain;

public class Everest extends Mountain {
    public Everest() {
        super();
        System.out.println("Running non-arg constructor Everest");
    }
    @Override
    public void height() {
        System.out.println("Has a height");
    }
    @Override
    public void climate() {
        System.out.println("Has a unique climate");
    }
    @Override
    public void location() {
        System.out.println("Located in different regions");
    }
    @Override
    public void trekking() {
        System.out.println("Used for trekking");
    }
    @Override
    public void wildlife() {
        System.out.println("Supports unique wildlife");
    }
}
