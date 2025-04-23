package com.xworkz.inheritence.internal.stationery;

public class Pen extends Stationery{
    public Pen() {
        super();
        System.out.println("Running non-arg constructor of Pen");
    }
    @Override
    public void write() {
        System.out.println("Used for writing");
    }
    @Override
    public void erase() {
        System.out.println("Items can erase");
    }
    @Override
    public void color() {
        System.out.println("Can be colorful");
    }
    @Override
    public void size() {
        System.out.println("In different sizes");
    }

}
