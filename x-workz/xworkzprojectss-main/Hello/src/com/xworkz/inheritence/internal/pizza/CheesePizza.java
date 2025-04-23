package com.xworkz.inheritence.internal.pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        super();
        System.out.println("Running non-arg constructor CheesePizza");
    }
    @Override
    public void hasCrust() {
        System.out.println("Crust made of dough");
    }
    @Override
    public void toppedWithSauce() {
        System.out.println("Topped with tomato or white sauce");
    }
    @Override
    public void includesCheese() {
        System.out.println("Cheese as a key ingredient");
    }
    @Override
    public void availableInDifferentFlavors() {
        System.out.println("Different flavors like Margherita, Pepperoni, and BBQ Chicken");
    }
    @Override
    public void cookedInOven() {
        System.out.println("Baked in an oven for a crispy crust");
    }
}
