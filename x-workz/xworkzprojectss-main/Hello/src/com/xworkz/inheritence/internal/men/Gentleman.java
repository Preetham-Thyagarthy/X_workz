package com.xworkz.inheritence.internal.men;

public class Gentleman extends Men {
    public Gentleman() {
        super();
        System.out.println("Running non-arg constructor Gentleman");
    }
    @Override
    public void work() {
        System.out.println("Engaged in different professions");
    }
    @Override
    public void takeResponsibility() {
        System.out.println("Responsibility for their families and society");
    }
    @Override
    public void dressWell() {
        System.out.println("Appropriately for occasions");
    }
    @Override
    public void stayFit() {
        System.out.println("Physical activities to stay fit");
    }
    @Override
    public void socialize() {
        System.out.println("Socialize and build strong relationships");
    }
}
