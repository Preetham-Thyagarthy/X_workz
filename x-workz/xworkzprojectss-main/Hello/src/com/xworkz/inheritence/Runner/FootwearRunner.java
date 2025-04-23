package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.footwear.Collegefootware;
import com.xworkz.inheritence.internal.footwear.Footwear;
import com.xworkz.inheritence.internal.footwear.SportsFootwear;

public class FootwearRunner {
    public static void main(String[] args) {

        Footwear footwear = new Footwear();
        footwear.protectsFeet();
        footwear.providesComfort();
        footwear.comesInVariousStyles();
        footwear.madeFromDifferentMaterials();
        footwear.availableInDifferentSizes();
        System.out.println("**************************************");
        Footwear footwear1 = new SportsFootwear();
        footwear1.protectsFeet();
        footwear1.providesComfort();
        footwear1.comesInVariousStyles();
        footwear1.madeFromDifferentMaterials();
        footwear1.availableInDifferentSizes();

        System.out.println("**************************************");
        SportsFootwear sportsShoe = new SportsFootwear();
        sportsShoe.protectsFeet();
        sportsShoe.providesComfort();
        sportsShoe.comesInVariousStyles();
        sportsShoe.madeFromDifferentMaterials();
        sportsShoe.availableInDifferentSizes();

        System.out.println("************Casting example**************");
        Collegefootware collegefootware=new Collegefootware();
        collegefootware.footweartypes(footwear);
        collegefootware.footweartypes(footwear1);
        collegefootware.footweartypes(sportsShoe);

    }
}
