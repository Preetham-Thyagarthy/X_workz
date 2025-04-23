package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.fish.Fish;
import com.xworkz.inheritence.internal.fish.GoldFish;
import com.xworkz.inheritence.internal.fish.Starfish;

public class FishRunner {
    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.livesInWater();
        fish.breathesThroughGills();
        fish.swimsUsingFins();
        fish.comesInDifferentSpecies();
        fish.laysEggs();
        System.out.println("**************************************");
        Fish fish1 = new GoldFish();
        fish1.livesInWater();
        fish1.breathesThroughGills();
        fish1.swimsUsingFins();
        fish1.comesInDifferentSpecies();
        fish1.laysEggs();

        System.out.println("**************************************");
        GoldFish goldFish = new GoldFish();
        goldFish.livesInWater();
        goldFish.breathesThroughGills();
        goldFish.swimsUsingFins();
        goldFish.comesInDifferentSpecies();
        goldFish.laysEggs();

        System.out.println("************Casting example**************");
        Starfish starfish=new Starfish();
        starfish.fishType(fish);
        starfish.fishType(fish1);
        starfish.fishType(goldFish);
    }
}
