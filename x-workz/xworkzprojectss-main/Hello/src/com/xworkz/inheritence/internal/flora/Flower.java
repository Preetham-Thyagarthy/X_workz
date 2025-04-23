package com.xworkz.inheritence.internal.flora;

public class Flower extends Flora {
    public Flower() {
        super();
        System.out.println("Running non-arg constructor Flower");
    }
    @Override
    public void grow() {
        System.out.println("Growing");
    }
    @Override
    public void photosynthesis() {
        System.out.println("Photosynthesis by plants");
    }
    @Override
    public void absorbWater() {
        System.out.println("Absorbs water");
    }
    @Override
    public void provideOxygen() {
        System.out.println("Provides oxygen");
    }
    @Override
    public void reproduce() {
        System.out.println("Plant Reproduce");
    }
    public void season(){
        System.out.println("Grown in sunny seasons");
    }
}
