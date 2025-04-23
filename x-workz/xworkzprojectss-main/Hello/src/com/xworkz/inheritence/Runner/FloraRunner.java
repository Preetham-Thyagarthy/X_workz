package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.flora.Flora;
import com.xworkz.inheritence.internal.flora.Flower;
import com.xworkz.inheritence.internal.flora.Sunflower;

public class FloraRunner {
    public static void main(String[] args) {

        Flora flora = new Flora();
        flora.grow();
        flora.photosynthesis();
        flora.absorbWater();
        flora.provideOxygen();
        flora.reproduce();
        System.out.println("**************************************");
        Flora flora1 = new Flower();
        flora1.grow();
        flora1.photosynthesis();
        flora1.absorbWater();
        flora1.provideOxygen();
        flora1.reproduce();

        System.out.println("**************************************");

        Flower flower = new Flower();
        flower.grow();
        flower.photosynthesis();
        flower.absorbWater();
        flower.provideOxygen();
        flower.reproduce();

        System.out.println("************Casting example**************");
        Sunflower sunflower=new Sunflower();
        sunflower.florachecker(flora);
        sunflower.florachecker(flora1);
        sunflower.florachecker(flower);
    }
}
