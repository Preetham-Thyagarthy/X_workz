package com.xworkz.inheritence.internal.clothing;

public class TShirt extends Clothing {
    public TShirt() {
        super();
        System.out.println("Running non-arg constructor TShirt");
    }
    @Override
    public void wear() {
        System.out.println("Worn");
    }
    @Override
    public void material() {
        System.out.println("Made of different materials");
    }
    @Override
    public void size() {
        System.out.println("Has sizes");
    }
    @Override
    public void brand() {
        System.out.println("Has brands");
    }
    @Override
    public void design() {
        System.out.println("Have designs");
    }
    public void color(){
        System.out.println("Different colors of the shirt");
    }
}
