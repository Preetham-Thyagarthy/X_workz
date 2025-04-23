package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.spects.Spects;
import com.xworkz.inheritence.internal.spects.Sunglasses;

public class SpectsRunner {
    public static void main(String[] args) {


        Spects spects = new Spects();
        spects.improvesVision();
        spects.hasLenses();
        spects.comesInFrames();
        spects.protectsEyes();
        spects.canBeCustomized();
        System.out.println("**************************************");
        Spects spects1 = new Sunglasses();
        spects1.improvesVision();
        spects1.hasLenses();
        spects1.comesInFrames();
        spects1.protectsEyes();
        spects1.canBeCustomized();

        System.out.println("**************************************");
        Sunglasses sunglasses = new Sunglasses();
        sunglasses.improvesVision();
        sunglasses.hasLenses();
        sunglasses.comesInFrames();
        sunglasses.protectsEyes();
        sunglasses.canBeCustomized();

        System.out.println("**************************************");
    }
}
