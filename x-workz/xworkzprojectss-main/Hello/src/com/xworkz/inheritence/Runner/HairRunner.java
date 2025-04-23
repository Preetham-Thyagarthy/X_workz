package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.hair.Hair;
import com.xworkz.inheritence.internal.hair.CurlyHair;
import com.xworkz.inheritence.internal.hair.StraightHair;

public class HairRunner {
    public static void main(String[] args) {


        Hair hair = new Hair();
        hair.providesProtection();
        hair.growsNaturally();
        hair.canBeStyled();
        hair.requiresMaintenance();
        hair.madeOfKeratin();
        System.out.println("**************************************");
        Hair hairs = new CurlyHair();
        hairs.providesProtection();
        hairs.growsNaturally();
        hairs.canBeStyled();
        hairs.requiresMaintenance();
        hairs.madeOfKeratin();

        System.out.println("**************************************");
        CurlyHair curlyHair = new CurlyHair();
        curlyHair.providesProtection();
        curlyHair.growsNaturally();
        curlyHair.canBeStyled();
        curlyHair.requiresMaintenance();
        curlyHair.madeOfKeratin();

        System.out.println("************Casting example**************");
        StraightHair straightHair=new StraightHair();
        straightHair.hairtype(hair);
        straightHair.hairtype(hairs);
        straightHair.hairtype(curlyHair);
    }
}
