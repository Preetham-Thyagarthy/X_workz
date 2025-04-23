package com.xworkz.inheritence.internal.knief;

public class Device extends Knief {
    public Device() {
        super();
        System.out.println("Running non-arg constructor HairScissors");
    }
    @Override
    public void usedForCutting() {
        System.out.println("Cutting various materials");
    }
    @Override
    public void hasSharpBlades() {
        System.out.println("Sharp blades for cutting");
    }
    @Override
    public void usedInHousehold() {
        System.out.println("Used in households for daily tasks");
    }
    @Override
    public void comesInDifferentSizes() {
        System.out.println("Various sizes for different purposes");
    }
    @Override
    public void requiresProperHandling() {
        System.out.println("Careful handling to avoid injuries");
    }
}
