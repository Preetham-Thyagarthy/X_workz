package com.xworkz.inheritence.internal.fish;

public class GoldFish extends Fish {
    public GoldFish() {
        super();
        System.out.println("Running non-arg constructor GoldFish");
    }
    @Override
    public void livesInWater() {
        System.out.println("In water,there are fishes");
    }
    @Override
    public void breathesThroughGills() {
        System.out.println("Using gills Fish breathe");
    }
    @Override
    public void swimsUsingFins() {
        System.out.println("Use fins to swim");
    }
    @Override
    public void comesInDifferentSpecies() {
        System.out.println("Exist in many species");
    }
    @Override
    public void laysEggs() {
        System.out.println("They lay eggs to reproduce");
    }
    public void color(){
        System.out.println("Fishes are of different colors");
    }
}
