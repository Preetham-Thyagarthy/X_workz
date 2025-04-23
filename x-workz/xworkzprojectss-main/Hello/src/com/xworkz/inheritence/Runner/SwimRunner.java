package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.swim.Swim;
import com.xworkz.inheritence.internal.swim.FreestyleSwim;

public class SwimRunner {
    public static void main(String[] args) {
        Swim swim = new Swim();
        swim.improvesHealth();
        swim.requiresWater();
        swim.isFullBodyExercise();
        swim.isPopularSport();
        swim.hasDifferentStyles();

        System.out.println("**************************************");
        FreestyleSwim freestyleSwim = new FreestyleSwim();
        freestyleSwim.improvesHealth();
        freestyleSwim.requiresWater();
        freestyleSwim.isFullBodyExercise();
        freestyleSwim.isPopularSport();
        freestyleSwim.hasDifferentStyles();

        System.out.println("**************************************");
    }
}
