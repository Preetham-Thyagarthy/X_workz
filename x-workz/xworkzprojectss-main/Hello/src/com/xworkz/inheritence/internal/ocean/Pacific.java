package com.xworkz.inheritence.internal.ocean;

public class Pacific extends Ocean {
    public Pacific() {
        super();
        System.out.println("Running non-arg constructor Pacific");
    }
    @Override
    public void depth() {
        System.out.println("Has great depth");
    }
    @Override
    public void marineLife() {
        System.out.println("Supports diverse marine life");
    }
    @Override
    public void waves() {
        System.out.println("Has strong waves");
    }
    @Override
    public void temperature() {
        System.out.println("Water temperature varies");
    }
    @Override
    public void tides() {
        System.out.println("Experiences tides");
    }
}
