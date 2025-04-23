package com.xworkz.inheritence.internal.furniture;

public class Chair extends Furniture {
    public Chair() {
        super();
        System.out.println("Running non-arg constructor Chair");
    }
    @Override
    public void support() {
        System.out.println("Provides support");
    }
    @Override
    public void material() {
        System.out.println("Made of different materials");
    }
    @Override
    public void weight() {
        System.out.println("Has different weights");
    }
    @Override
    public void move() {
        System.out.println("Can be moved");
    }
    @Override
    public void design() {
        System.out.println("Has different designs");
    }
    public void shaping(){
        System.out.println("Shape is of rectangular");
    }
}
