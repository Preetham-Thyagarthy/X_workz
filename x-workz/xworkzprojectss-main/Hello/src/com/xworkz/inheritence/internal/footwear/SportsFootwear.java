package com.xworkz.inheritence.internal.footwear;

public class SportsFootwear extends Footwear {
    public SportsFootwear() {
        super();
        System.out.println("Running non-arg constructor SportsShoe");
    }
    @Override
    public void protectsFeet() {
        System.out.println("Protect feet");
    }
    @Override
    public void providesComfort() {
        System.out.println("Provide comfort");
    }
    @Override
    public void comesInVariousStyles() {
        System.out.println("Come in different styles");
    }
    @Override
    public void madeFromDifferentMaterials() {
        System.out.println("Made from leather, rubber, or fabric");
    }
    @Override
    public void availableInDifferentSizes() {
        System.out.println("Are available in various sizes");
    }
    public void usage(){
        System.out.println("USed for any place and anywhere");
    }
}
