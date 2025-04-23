package com.xworkz.inheritence.internal.frozenBottle;

public class IceBottle extends FrozenBottle {
    public IceBottle() {
        super();
        System.out.println("Running non-arg constructor IceBottle");
    }
    @Override
    public void freezeWater() {
        System.out.println("Ice-cold water");
    }
    @Override
    public void keepCold() {
        System.out.println("Keeps drinks cold for long");
    }
    @Override
    public void useForCooling() {
        System.out.println("Can be used to cool other items");
    }
    @Override
    public void meltSlowly() {
        System.out.println("Melts slowly over time");
    }
    @Override
    public void carryAnywhere() {
        System.out.println("Portable and useful in summers");
    }
    public void coldbottle(){
        System.out.println("This will contain cold liquids");
    }
}
