package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.towel.Towel;
import com.xworkz.inheritence.internal.towel.BathTowel;

public class TowelRunner {
    public static void main(String[] args) {


        Towel towel = new Towel();
        towel.absorbWater();
        towel.madeOfCotton();
        towel.availableInSizes();
        towel.usedInBathroom();
        towel.requiresWashing();
        System.out.println("**************************************");
        Towel towel1 = new BathTowel();
        towel1.absorbWater();
        towel1.madeOfCotton();
        towel1.availableInSizes();
        towel1.usedInBathroom();
        towel1.requiresWashing();

        System.out.println("**************************************");
        BathTowel bathTowel = new BathTowel();
        bathTowel.absorbWater();
        bathTowel.madeOfCotton();
        bathTowel.availableInSizes();
        bathTowel.usedInBathroom();
        bathTowel.requiresWashing();

        System.out.println("**************************************");
    }
}
