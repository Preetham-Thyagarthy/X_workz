package com.xworkz.inheritence.internal.lamp;

public class Light extends Lamp {
    public Light() {
        super();
        System.out.println("Running non-arg constructor Light");
    }
    @Override
    public void color() {
        System.out.println("Color is yellow");
    }
    @Override
    public void shape() {
        System.out.println("Round dome circle");
    }
    @Override
    public void size() {
        System.out.println("Big size");
    }
    @Override
    public void appearance() {
        System.out.println("Shining lamp");
    }
    @Override
    public void use() {
        System.out.println("Lighting lamp");
    }
}
