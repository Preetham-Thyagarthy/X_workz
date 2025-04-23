package com.xworkz.inheritence.internal.meal;

public class Meal {
    public Meal() {
        System.out.println("Running non-arg constructor Food");
    }
    public void eat() {
        System.out.println("Food can be eaten");
    }
    public void taste() {
        System.out.println("Food has different tastes");
    }
    public void cook() {
        System.out.println("Food is cooked");
    }
    public void healthy() {
        System.out.println("Some food is healthy");
    }
    public void spicy() {
        System.out.println("Food can be spicy");
    }
}
