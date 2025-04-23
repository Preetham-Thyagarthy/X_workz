package com.xworkz.inheritence.internal.formal;

public class SilkFormal extends Formal {
    public SilkFormal() {
        super();
        System.out.println("Running non-arg constructor Silk formalL");
    }
    @Override
    public void traditionalWear() {
        System.out.println("Traditional Indian wear");
    }
    @Override
    public void comfortable() {
        System.out.println("Comfortable to wear");
    }
    @Override
    public void wornOnFestivals() {
        System.out.println("Commonly worn on festivals and special occasions");
    }
    @Override
    public void comesInVariousDesigns() {
        System.out.println("Available in different designs and patterns");
    }
    @Override
    public void pairedWithPajama() {
        System.out.println("Paired with pajama or jeans");
    }
    public void materials(){
        System.out.println("This will have cotton and silk cloths");
    }
}
