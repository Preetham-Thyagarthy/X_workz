package com.xworkz.inheritence.internal.trousers;

public class JeansTrousers extends Trousers {
    public JeansTrousers() {
        super();
        System.out.println("Running non-arg constructor JeansPant");
    }
    @Override
    public void wear() {
        System.out.println("Trousers is worn");
    }
    @Override
    public void madeOfFabric() {
        System.out.println("Made from different types of fabric");
    }
    @Override
    public void availableInDifferentStyles() {
        System.out.println("Available in different styles");
    }
    @Override
    public void provideComfort() {
        System.out.println("Provides comfort and flexibility");
    }
    @Override
    public void comesInVariousSizes() {
        System.out.println("Various sizes for all age groups");
    }
}
