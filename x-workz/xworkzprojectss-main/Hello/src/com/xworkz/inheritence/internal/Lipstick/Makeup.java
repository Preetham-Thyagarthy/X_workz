package com.xworkz.inheritence.internal.Lipstick;

import com.xworkz.inheritence.internal.laptop.Laptop;

public class Makeup extends Lipstick {
    public Makeup() {
        super();
        System.out.println("Running non-arg constructor Makeup");
    }
    @Override
    public void apply() {
        System.out.println("Applying");
    }
    @Override
    public void use() {
        System.out.println("Using");
    }
    @Override
    public void sale() {
        System.out.println("Saleing");
    }
    @Override
    public void remove() {
        System.out.println("Removing");
    }
    @Override
    public void refill() {
        System.out.println("Refilling");
    }
}
