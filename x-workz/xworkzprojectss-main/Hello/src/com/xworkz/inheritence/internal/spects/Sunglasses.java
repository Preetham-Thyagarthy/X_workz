package com.xworkz.inheritence.internal.spects;

public class Sunglasses extends Spects {
    public Sunglasses() {
        super();
        System.out.println("Running non-arg constructor Sunglasses");
    }
    @Override
    public void improvesVision() {
        System.out.println("Vision for people with eyesight problems");
    }
    @Override
    public void hasLenses() {
        System.out.println("Lenses for correcting vision");
    }
    @Override
    public void comesInFrames() {
        System.out.println("Different frame styles and materials");
    }
    @Override
    public void protectsEyes() {
        System.out.println("Eyes from dust and strain");
    }
    @Override
    public void canBeCustomized() {
        System.out.println("Customized lenses based on prescription");
    }
}
