package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.frozenBottle.FrozenBottle;
import com.xworkz.inheritence.internal.frozenBottle.IceBottle;
import com.xworkz.inheritence.internal.frozenBottle.WaterBottle;

public class FrozenBottleRunner {
    public static void main(String[] args) {

        FrozenBottle bottle = new FrozenBottle();
        bottle.freezeWater();
        bottle.keepCold();
        bottle.useForCooling();
        bottle.meltSlowly();
        bottle.carryAnywhere();
        System.out.println("**************************************");
        FrozenBottle bottle2 = new IceBottle();
        bottle2.freezeWater();
        bottle2.keepCold();
        bottle2.useForCooling();
        bottle2.meltSlowly();
        bottle2.carryAnywhere();

        System.out.println("**************************************");
        IceBottle iceBottle = new IceBottle();
        iceBottle.freezeWater();
        iceBottle.keepCold();
        iceBottle.useForCooling();
        iceBottle.meltSlowly();
        iceBottle.carryAnywhere();

        System.out.println("************Casting example**************");
        WaterBottle waterBottle=new WaterBottle();
        waterBottle.numberofbottles(bottle);
        waterBottle.numberofbottles(bottle2);
        waterBottle.numberofbottles(iceBottle);

    }
}
