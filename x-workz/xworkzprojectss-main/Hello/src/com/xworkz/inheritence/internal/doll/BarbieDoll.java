package com.xworkz.inheritence.internal.doll;

public class BarbieDoll extends Doll {
    public BarbieDoll() {
        super();
        System.out.println("Running non-arg constructor BarbieDoll");
    }
    @Override
    public void play() {
        System.out.println("Playing");
    }
    @Override
    public void dressUp() {
        System.out.println("Dressed in different outfits");
    }
    @Override
    public void talk() {
        System.out.println("Some can talk");
    }
    @Override
    public void move() {
        System.out.println("Have moving parts");
    }
    @Override
    public void collect() {
        System.out.println("Often collected as a hobby");
    }
    public void walking(){
        System.out.println("Walking of the doll");
    }
}
