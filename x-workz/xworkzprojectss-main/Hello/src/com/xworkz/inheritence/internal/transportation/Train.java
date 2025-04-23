package com.xworkz.inheritence.internal.transportation;

public class Train extends Transportation {
    public Train() {
        super();
        System.out.println("Running non-arg constructor Train");
    }
    @Override
    public void move() {
        System.out.println("Used for moving");
    }
    @Override
    public void speed() {
        System.out.println("Has different speeds");
    }
    @Override
    public void fuel() {
        System.out.println("Requires fuel");
    }
    @Override
    public void capacity() {
        System.out.println("Has capacity");
    }
    @Override
    public void type() {
        System.out.println("Has different types");
    }
}
