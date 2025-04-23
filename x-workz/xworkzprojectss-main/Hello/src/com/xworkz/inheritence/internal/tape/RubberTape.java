package com.xworkz.inheritence.internal.tape;

public class RubberTape extends Tape {
    public RubberTape() {
        super();
        System.out.println("Running non-arg constructor RubberBand");
    }
    @Override
    public void usedForBinding() {
        System.out.println("Used for binding objects together");
    }
    @Override
    public void madeOfElasticMaterial() {
        System.out.println("Made of elastic material for flexibility");
    }
    @Override
    public void availableInDifferentSizes() {
        System.out.println("Available in different sizes and colors");
    }
    @Override
    public void stretchesEasily() {
        System.out.println("Stretch easily without breaking");
    }
    @Override
    public void usedForVariousPurposes() {
        System.out.println("Used in offices, homes, and industries");
    }
}
