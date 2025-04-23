package com.xworkz.inheritence.internal.hair;

public class StraightHair {
    public void hairtype(Hair hair) {
        hair.providesProtection();
        hair.growsNaturally();
        hair.canBeStyled();
        hair.requiresMaintenance();
        hair.madeOfKeratin();

        if (hair instanceof CurlyHair) {
            System.out.println("This is an instance of CurlyHair.");
            CurlyHair curly = (CurlyHair) hair;
            curly.conditioner();
        }
    }
}
