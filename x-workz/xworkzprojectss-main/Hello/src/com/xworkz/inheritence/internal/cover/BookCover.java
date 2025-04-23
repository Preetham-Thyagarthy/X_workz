package com.xworkz.inheritence.internal.cover;

public class BookCover extends Cover {
    public BookCover() {
        super();
        System.out.println("Running non-arg constructor BookCover");
    }
    @Override
    public void protect() {
        System.out.println("Protects the item inside");
    }
    @Override
    public void design() {
        System.out.println("Unique design");
    }
    @Override
    public void provideGrip() {
        System.out.println("Provides grip for handling");
    }
    @Override
    public void waterproof() {
        System.out.println("Covers are waterproof");
    }
    @Override
    public void enhanceLook() {
        System.out.println("The look of the item");
    }
    public void materials(){
        System.out.println("Paper cover is used");
    }
}
