package com.xworkz.inheritence.internal.pup;

public class LabradorPup extends Pup {
    public LabradorPup() {
        super();
        System.out.println("Running non-arg constructor LabradorPuppy");
    }
    @Override
    public void playful() {
        System.out.println("Playful and energetic");
    }
    @Override
    public void requiresTraining() {
        System.out.println("Proper training and socialization");
    }
    @Override
    public void needsCare() {
        System.out.println("Proper care, food, and medical attention");
    }
    @Override
    public void communicatesWithBarks() {
        System.out.println("Using barks and body language");
    }
    @Override
    public void lovesToCuddle() {
        System.out.println("Cuddle and show affection");
    }
}
