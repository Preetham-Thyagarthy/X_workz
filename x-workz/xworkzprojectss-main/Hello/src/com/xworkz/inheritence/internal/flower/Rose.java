package com.xworkz.inheritence.internal.flower;

public class Rose extends Flower {
    public Rose() {
        super();
        System.out.println("Running non-arg constructor Rose");
    }
    @Override
    public void bloom() {
        System.out.println("Blooms");
    }
    @Override
    public void fragrance() {
        System.out.println("Has fragrance");
    }
    @Override
    public void color() {
        System.out.println("Has color");
    }
    @Override
    public void petals() {
        System.out.println("Has petals");
    }
    @Override
    public void pollination() {
        System.out.println("Helps in pollination");
    }
    public void petels(){
        System.out.println("The flowers will have petels of different pettles");
    }
}
