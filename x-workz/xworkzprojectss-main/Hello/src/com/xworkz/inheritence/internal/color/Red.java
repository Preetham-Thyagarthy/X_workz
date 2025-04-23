package com.xworkz.inheritence.internal.color;

public class Red extends Color {
    public Red() {
        super();
        System.out.println("Running non-arg constructor Red");
    }
    @Override
    public void display() {
        System.out.println("Color is displayed");
    }
    @Override
    public void mix() {
        System.out.println("Color is mixing");
    }
    @Override
    public void brighten() {
        System.out.println("Brightening");
    }
    @Override
    public void fade() {
        System.out.println("Fading over time");
    }
    public void shape(){
        System.out.println("Shape is semicircle");
    }
}
