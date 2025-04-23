package com.xworkz.inheritence.internal.milk;

public class AlmondMilk extends Milk {
    public AlmondMilk() {
        super();
        System.out.println("Running non-arg constructor AlmondMilk");
    }
    @Override
    public void provideCalcium() {
        System.out.println("Provides calcium for strong bones");
    }
    @Override
    public void usedInCooking() {
        System.out.println("Widely used in cooking and baking");
    }
    @Override
    public void boostImmunity() {
        System.out.println("Boosting immunity");
    }
    @Override
    public void consumedDaily() {
        System.out.println("Part of daily diet for many people");
    }
    @Override
    public void availableInDifferentTypes() {
        System.out.println("Available in different types.");
    }
}
