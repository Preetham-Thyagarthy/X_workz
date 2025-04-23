package com.xworkz.inheritence.internal.wild;

public class Fish extends Wild {
    public Fish() {
        super();
        System.out.println("Running non-arg constructor Dog");
    }
    @Override
    public void eat() {
        System.out.println("Eating");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
    @Override
    public void sound() {
        System.out.println("Makes sound");
    }
    @Override
    public void run() {
        System.out.println("Running");
    }
    @Override
    public void breathe() {
        System.out.println("Breathing");
    }
}
