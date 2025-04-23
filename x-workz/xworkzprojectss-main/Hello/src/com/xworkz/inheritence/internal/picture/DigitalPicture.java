package com.xworkz.inheritence.internal.picture;

public class DigitalPicture extends Picture {
    public DigitalPicture() {
        super();
        System.out.println("Running non-arg constructor DigitalPhoto");
    }
    @Override
    public void capture() {
        System.out.println("Captures a moment in time");
    }
    @Override
    public void storeMemory() {
        System.out.println("Stores beautiful memories");
    }
    @Override
    public void printedOnPaper() {
        System.out.println("Can be printed on paper");
    }
    @Override
    public void availableInDigitalFormat() {
        System.out.println("Available in digital format");
    }
    @Override
    public void sharedOnSocialMedia() {
        System.out.println("Shared on social media platforms");
    }
}
