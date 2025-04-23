package com.xworkz.inheritence.internal.bike;

public class SportsBike extends Bike {
    public SportsBike() {
        super();
        System.out.println("Running non-arg constructor SportsBike");
    }
    @Override
    public void usedForTransportation() {
        System.out.println("Personal transportation");
    }
    @Override
    public void hasTwoWheels() {
        System.out.println("Have two wheels");
    }
    @Override
    public void runsOnFuel() {
        System.out.println("Run on petrol or electric power");
    }
    @Override
    public void requiresHelmet() {
        System.out.println("Requires wearing a helmet");
    }
    @Override
    public void comesInDifferentModels() {
        System.out.println("Come in different models");
    }
    public void fastfastly() {
        System.out.println("It will runs fastly");
    }
}
