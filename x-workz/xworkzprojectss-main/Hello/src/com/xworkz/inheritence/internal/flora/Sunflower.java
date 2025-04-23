package com.xworkz.inheritence.internal.flora;

public class Sunflower {
    public void florachecker(Flora flora) {
        flora.grow();
        flora.photosynthesis();
        flora.absorbWater();
        flora.provideOxygen();
        flora.reproduce();

        if (flora instanceof Flower) {
            System.out.println("This is an instance of Flower");
            Flower flower = (Flower) flora;
            flower.season();
        }
    }

}
