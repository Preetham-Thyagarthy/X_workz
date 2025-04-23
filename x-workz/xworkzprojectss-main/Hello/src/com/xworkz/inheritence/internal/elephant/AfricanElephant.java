package com.xworkz.inheritence.internal.elephant;

public class AfricanElephant extends Elephant {
    public AfricanElephant() {
        super();
        System.out.println("Running non-arg constructor AfricanElephant");
    }
    @Override
    public void eat() {
        System.out.println("Eats plants and fruits");
    }
    @Override
    public void drinkWater() {
        System.out.println("Drinks large amounts of water");
    }
    @Override
    public void trumpet() {
        System.out.println("Makes a trumpet sound");
    }
    @Override
    public void useTrunk() {
        System.out.println("Uses its trunk for various tasks");
    }
    @Override
    public void walkSlowly() {
        System.out.println("Walks slowly but steadily");
    }
    public void colors(){
        System.out.println("Elephant are of different colors like black and gray");
    }
}
