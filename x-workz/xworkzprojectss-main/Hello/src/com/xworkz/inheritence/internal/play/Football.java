package com.xworkz.inheritence.internal.play;

public class Football extends Play {
    public Football() {
        super();
        System.out.println("Running non-arg constructor Football");
    }
    @Override
    public void play() {
        System.out.println("Played");
    }
    @Override
    public void rules() {
        System.out.println("Have rules");
    }
    @Override
    public void competition() {
        System.out.println("Involve competition");
    }
    @Override
    public void team() {
        System.out.println("Have teams");
    }
    @Override
    public void training() {
        System.out.println("Require training");
    }
}
