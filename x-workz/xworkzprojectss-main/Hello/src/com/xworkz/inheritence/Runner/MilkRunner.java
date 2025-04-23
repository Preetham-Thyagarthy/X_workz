package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.milk.Milk;
import com.xworkz.inheritence.internal.milk.AlmondMilk;

public class MilkRunner {
    public static void main(String[] args) {


        Milk milk = new Milk();
        milk.provideCalcium();
        milk.usedInCooking();
        milk.boostImmunity();
        milk.consumedDaily();
        milk.availableInDifferentTypes();

        System.out.println("**************************************");
        Milk milks = new AlmondMilk();
        milks.provideCalcium();
        milks.usedInCooking();
        milks.boostImmunity();
        milks.consumedDaily();
        milks.availableInDifferentTypes();



        System.out.println("**************************************");
        AlmondMilk almondMilk = new AlmondMilk();
        almondMilk.provideCalcium();
        almondMilk.usedInCooking();
        almondMilk.boostImmunity();
        almondMilk.consumedDaily();
        almondMilk.availableInDifferentTypes();
    }
}
