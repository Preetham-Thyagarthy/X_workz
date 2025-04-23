package com.xworkz.inheritence.internal.festival;

public class Diwali extends Festival {
    public Diwali() {
        super();
        System.out.println("Running non-arg constructor of Diwali");
    }
    @Override
    public void celebrate() {
        System.out.println("Celebrated joyfully");
    }
    @Override
    public void traditions() {
        System.out.println("Follow different traditions");
    }
    @
    Override
    public void holidays() {
        System.out.println("Brings holiday");
    }
    @Override
    public void food() {
        System.out.println("Have special food items");
    }
    public void culture(){
        System.out.println("In one one states there are different cultures");
    }
}
