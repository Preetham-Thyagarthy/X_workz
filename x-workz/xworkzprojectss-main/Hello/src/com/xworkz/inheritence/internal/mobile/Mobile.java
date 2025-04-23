package com.xworkz.inheritence.internal.mobile;

public class Mobile {
    public Mobile() {
        System.out.println("Running non-arg constructor Mobile");
    }
    public void call() {
        System.out.println("Mobile can make calls");
    }
    public void message() {
        System.out.println("Mobile can send messages");
    }
    public void camera() {
        System.out.println("Mobile has a camera");
    }
    public void battery() {
        System.out.println("Mobile has a battery");
    }
    public void internet() {
        System.out.println("Mobile can browse the internet");
    }
}
