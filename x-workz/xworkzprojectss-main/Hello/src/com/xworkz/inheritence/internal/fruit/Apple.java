package com.xworkz.inheritence.internal.fruit;

public class Apple extends Fruit {
    public Apple() {
        super();
        System.out.println("Running non-arg constructor of Apple");
    }
    @Override
    public void taste() {
        System.out.println("Has a taste");
    }
    @Override
    public void color() {
        System.out.println("Has a color");
    }
    @Override
    public void nutrients() {
        System.out.println("Contains nutrients");
    }
    @Override
    public void seasonal() {
        System.out.println("Are seasonal");
    }
    public void protien(){
        System.out.println("It will provide vitamins and protiens");
    }
}
