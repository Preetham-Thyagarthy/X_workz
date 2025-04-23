package com.xworkz.inheritence.internal.season;

public class Winter extends Season {
    public Winter() {
        super();
        System.out.println("Running non-arg constructor Winter");
    }
    @Override
    public void weather() {
        System.out.println("Affects the weather");
    }
    @Override
    public void duration() {
        System.out.println("Few months");
    }
    @Override
    public void activities() {
        System.out.println("Allow different activities");
    }
    @Override
    public void temperature() {
        System.out.println("Different temperatures");
    }
    @Override
    public void impact() {
        System.out.println("Nature and humans");
    }
}
