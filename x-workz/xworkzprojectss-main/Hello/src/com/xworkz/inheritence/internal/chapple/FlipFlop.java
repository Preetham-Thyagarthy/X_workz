package com.xworkz.inheritence.internal.chapple;

public class FlipFlop extends Chapple {
    public FlipFlop() {
        super();
        System.out.println("Running non-arg constructor FlipFlop");
    }
    @Override
    public void wear() {
        System.out.println("Worn");
    }
    @Override
    public void walk() {
        System.out.println("Used for walking");
    }
    @Override
    public void grip() {
        System.out.println("Provides grip");
    }
    @Override
    public void comfort() {
        System.out.println("Provides comfort");
    }
    public void jump(){
        System.out.println("Used for jumping");
    }
}
