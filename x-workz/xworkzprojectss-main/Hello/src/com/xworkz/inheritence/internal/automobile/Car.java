package com.xworkz.inheritence.internal.automobile;

public class Car extends Automobile {
    public Car() {
        super();
        System.out.println("Running non-arg constructor Car");
    }
    @Override
    public void move() {
        System.out.println("Moving");
    }
    @Override
    public void stop() {
        System.out.println("Stopping");
    }
    @Override
    public void fuel() {
        System.out.println("Needs fuel");
    }
    @Override
    public void speed() {
        System.out.println("Has speed");
    }
    @Override
    public void transport() {
        System.out.println("Used for transport");
    }

    public void distance(){
        System.out.println("Distance is covered very fastly");
    }
}
