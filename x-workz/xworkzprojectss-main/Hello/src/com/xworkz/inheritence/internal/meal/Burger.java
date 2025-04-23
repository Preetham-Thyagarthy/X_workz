package com.xworkz.inheritence.internal.meal;

public class Burger extends Meal {
    public Burger() {
        super();
        System.out.println("Running non-arg constructor Burger");
    }
    @Override
    public void eat() {
        System.out.println("Food eaten");
    }
    @Override
    public void taste() {
        System.out.println("Different tastes");
    }
    @Override
    public void cook() {
        System.out.println("Cooked");
    }
    @Override
    public void healthy() {
        System.out.println("Healthy food");
    }
    @Override
    public void spicy() {
        System.out.println("Spicy food");
    }
}
