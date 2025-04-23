package com.xworkz.inheritence.internal.cupboard;

public class Door extends Cupboard {
    public Door(){
        super();
        System.out.println("running non-arg const Door");
    }
    @Override
    public void lock(){
        System.out.println("Locked");
    }
    @Override
    public void key(){
        System.out.println("Have key");
    }
    @Override
    public void handle(){
        System.out.println("handled");
    }
    @Override
    public void open(){
        System.out.println("opened");
    }
    @Override
    public void close(){
        System.out.println("closed");
    }
    public void color(){
        System.out.println("Has the color black");
    }
}
