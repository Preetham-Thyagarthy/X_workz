package com.xworkz.inheritence.internal.Material;

public class Copper extends Material{
    public Copper() {
        super();
        System.out.println("Running non-arg constructor Gold");
    }
    @Override
    public void conductivity() {
        System.out.println("Good conductor of electricity");
    }
    @Override
    public void durability() {
        System.out.println("Durable");
    }
    @Override
    public void malleability() {
        System.out.println("Shaped into different forms");
    }
    @Override
    public void density() {
        System.out.println("Certain density");
    }
    @Override
    public void corrosion() {
        System.out.println("Corrode over time");
    }
}
