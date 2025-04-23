package com.xworkz.inheritence.internal.instrument;

public class Guitar extends Instrument {
        public Guitar() {
            super();
            System.out.println("Running non-arg constructor Guitar");
        }
        @Override
    public void play() {
        System.out.println("Played");
    }
    @Override
    public void sound() {
        System.out.println("Produces sound");
    }
    @Override
    public void type() {
        System.out.println("Has a type");
    }
    @Override
    public void maintenance() {
        System.out.println("Requires maintenance");
    }
    @Override
    public void brand() {
        System.out.println("Different brands");
    }
}
