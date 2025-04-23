package com.xworkz.inheritence.internal.refreshment;

public class Coffee extends Refreshment {
    public Coffee() {
        super();
        System.out.println("Running non-arg constructor of Coffee");
    }
    @Override
    public void drink() {
        System.out.println("For drinking");
    }
    @Override
    public void temperature() {
        System.out.println("Can be hot or cold");
    }
    @Override
    public void flavor() {
        System.out.println("Different flavors");
    }
    @Override
    public void refresh() {
        System.out.println("Is refreshing");
    }
}
