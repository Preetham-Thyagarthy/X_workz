package com.xworkz.inheritence.internal.element;

public class Oxygen extends Element {
    public Oxygen() {
        super();
        System.out.println("Running non-arg constructor Oxygen");
    }
    @Override
    public void atomicNumber() {
        System.out.println("Atomic number");
    }
    @Override
    public void symbol() {
        System.out.println("Chemical symbol");
    }
    @Override
    public void state() {
        System.out.println("Different states");
    }
    @Override
    public void bonding() {
        System.out.println("Chemical bonds");
    }
    @Override
    public void reactivity() {
        System.out.println("Chemical reactivity");
    }
    public void table(){
        System.out.println("The periodic table of the elements");
    }
}
