package com.xworkz.inheritence.internal.footwear;

public class Collegefootware {
    public void footweartypes(Footwear footwear) {
        footwear.protectsFeet();
        footwear.providesComfort();
        footwear.comesInVariousStyles();
        footwear.madeFromDifferentMaterials();
        footwear.availableInDifferentSizes();

        if (footwear instanceof SportsFootwear) {
            System.out.println("This is an instance of SportsFootwear");
            SportsFootwear sports = (SportsFootwear) footwear;
            sports.usage();
        }
    }
}
