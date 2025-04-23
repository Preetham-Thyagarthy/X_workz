package com.xworkz.inheritence.internal.automobile;

public class Automobile {
    public Automobile() {
        System.out.println("Running non-arg constructor Automobile");
    }
    public void move() {
        System.out.println("Automobile is moving");
    }
    public void stop() {
        System.out.println("Automobile is stopping");
    }
    public void fuel() {
        System.out.println("Automobile needs fuel");
    }
    public void speed() {
        System.out.println("Automobile has speed");
    }
    public void transport() {
        System.out.println("Automobile is used for transport");
    }
}
