package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.wine.Wine;
import com.xworkz.inheritence.internal.wine.RedWine;

public class WineRunner {
    public static void main(String[] args) {


        Wine wine = new Wine();
        wine.madeFromGrapes();
        wine.containsAlcohol();
        wine.improvesWithAge();
        wine.servedInGlasses();
        wine.usedInCooking();
        System.out.println("**************************************");
        Wine wine1 = new RedWine();
        wine1.madeFromGrapes();
        wine1.containsAlcohol();
        wine1.improvesWithAge();
        wine1.servedInGlasses();
        wine1.usedInCooking();

        System.out.println("**************************************");
        RedWine redWine = new RedWine();
        redWine.madeFromGrapes();
        redWine.containsAlcohol();
        redWine.improvesWithAge();
        redWine.servedInGlasses();
        redWine.usedInCooking();


    }
}
