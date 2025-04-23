package com.xworkz.inheritence.internal.towel;

public class BathTowel extends Towel {
    public BathTowel() {
        super();
        System.out.println("Running non-arg constructor BathTowel");
    }
    @Override
    public void absorbWater() {
        System.out.println("Absorbs water");
    }
    @Override
    public void madeOfCotton() {
        System.out.println("Made from cotton fabric");
    }
    @Override
    public void availableInSizes() {
        System.out.println("Available in different sizes");
    }
    @Override
    public void usedInBathroom() {
        System.out.println("Commonly used in bathrooms");
    }
    @Override
    public void requiresWashing() {
        System.out.println("Regular washing for hygiene");
    }
}
