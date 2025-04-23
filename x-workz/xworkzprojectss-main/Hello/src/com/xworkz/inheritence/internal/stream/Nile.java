package com.xworkz.inheritence.internal.stream;

public class Nile extends Stream {
    public Nile() {
        super();
        System.out.println("Running non-arg constructor Nile");
    }
    @Override
    public void length() {
        System.out.println("Certain length");
    }
    @Override
    public void origin() {
        System.out.println("Originates from a source");
    }
    @Override
    public void flows() {
        System.out.println("Different regions");
    }
    @Override
    public void providesWater() {
        System.out.println("Water for drinking and irrigation");
    }
    @Override
    public void wildlife() {
        System.out.println("Aquatic wildlife");
    }
}
