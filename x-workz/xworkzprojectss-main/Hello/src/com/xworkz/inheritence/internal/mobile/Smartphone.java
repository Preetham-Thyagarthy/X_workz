package com.xworkz.inheritence.internal.mobile;

public class Smartphone extends Mobile {
    public Smartphone() {
        super();
        System.out.println("Running non-arg constructor Smartphone");
    }
    @Override
    public void call() {
        System.out.println("Can make calls");
    }
    @Override
    public void message() {
        System.out.println("Can send messages");
    }
    @Override
    public void camera() {
        System.out.println("Has a camera");
    }
    @Override
    public void battery() {
        System.out.println("Has a battery");
    }
    @Override
    public void internet() {
        System.out.println("Browse the internet");
    }
}
