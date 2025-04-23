package com.xworkz.inheritence.internal.utensil;

public class Hammer extends Utensil {
    public Hammer() {
        super();
        System.out.println("Running non-arg constructor of Hammer");
    }
    @Override
    public void use() {
        System.out.println("Used for work");
    }
    @Override
    public void material() {
        System.out.println("Made of metal or plastic");
    }
    @Override
    public void grip() {
        System.out.println("Has a grip");
    }
    @Override
    public void durability() {
        System.out.println("Should be durable");
    }
}
