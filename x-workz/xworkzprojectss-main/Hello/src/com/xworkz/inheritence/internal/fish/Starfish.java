package com.xworkz.inheritence.internal.fish;

public class Starfish {
    public void fishType(Fish fish) {
        fish.livesInWater();
        fish.breathesThroughGills();
        fish.swimsUsingFins();
        fish.comesInDifferentSpecies();
        fish.laysEggs();

        if (fish instanceof GoldFish) {
            System.out.println("This is an instance of GoldFish");
            GoldFish goldFish = (GoldFish) fish;
            goldFish.color();
        }
    }
}
