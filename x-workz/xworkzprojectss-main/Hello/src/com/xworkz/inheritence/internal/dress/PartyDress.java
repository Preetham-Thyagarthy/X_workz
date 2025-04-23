package com.xworkz.inheritence.internal.dress;

public class PartyDress extends Dress {
    public PartyDress() {
        super();
        System.out.println("Running non-arg constructor PartyDress");
    }
    @Override
    public void wear() {
        System.out.println("Dress is wored");
    }
    @Override
    public void comesInDifferentStyles() {
        System.out.println("Different styles and designs");
    }
    @Override
    public void availableForAllGenders() {
        System.out.println("Available for both men and women");
    }
    @Override
    public void providesComfort() {
        System.out.println("Provides comfort and style");
    }
    @Override
    public void madeOfVariousMaterials() {
        System.out.println("Made of materials");
    }
    public void colorofsuites(){
        System.out.println("Suits are ofdifferent colors");
    }
}
