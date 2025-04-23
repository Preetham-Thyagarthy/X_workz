package com.xworkz.inheritence.internal.sugar;

public class BrownSugar extends Sugar {
    public BrownSugar() {
        super();
        System.out.println("Running non-arg constructor BrownSugar");
    }
    @Override
    public void sweeten() {
        System.out.println("Sweeten food and drinks");
    }
    @Override
    public void dissolve() {
        System.out.println("Dissolves in water");
    }
    @Override
    public void store() {
        System.out.println("Stored in airtight containers");
    }
    @Override
    public void addToDesserts() {
        System.out.println("Added to desserts");
    }
    @Override
    public void usedInBaking() {
        System.out.println("Essential ingredient in baking");
    }
}
