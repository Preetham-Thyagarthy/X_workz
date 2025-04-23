package com.xworkz.inheritence.internal.area;

public class Bedroom extends Area {
    public Bedroom() {
        super();
        System.out.println("Running non-arg constructor Bedroom");
    }
    @Override
    public void enter() {
        System.out.println("Area entered");
    }
    @Override
    public void decorate() {
        System.out.println("Decorated area");
    }
    @Override
    public void clean() {
        System.out.println("Cleaned area");
    }
    @Override
    public void ventilate() {
        System.out.println("Ventilated area");
    }

    public void design(){
        System.out.println("Designing of the room");
    }
}
