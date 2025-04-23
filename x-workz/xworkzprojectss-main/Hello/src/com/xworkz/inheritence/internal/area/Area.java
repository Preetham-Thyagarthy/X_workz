package com.xworkz.inheritence.internal.area;

public class Area {
    public Area() {
        System.out.println("Running non-arg constructor Area");
    }
    public void enter() {
        System.out.println("Entering the area");
    }
    public void decorate() {
        System.out.println("Area is decorated");
    }
    public void clean() {
        System.out.println("Area is cleaned");
    }
    public void ventilate() {
        System.out.println("Area has ventilation");
    }
}
