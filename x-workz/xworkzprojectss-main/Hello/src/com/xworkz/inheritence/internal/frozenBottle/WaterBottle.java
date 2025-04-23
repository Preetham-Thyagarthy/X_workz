package com.xworkz.inheritence.internal.frozenBottle;

public class WaterBottle {
    public void numberofbottles(FrozenBottle bottle) {
        bottle.freezeWater();
        bottle.keepCold();
        bottle.useForCooling();
        bottle.meltSlowly();
        bottle.carryAnywhere();

        if (bottle instanceof IceBottle) {
            System.out.println("This is an instance of IceBottle");
            IceBottle ice = (IceBottle) bottle;
            ice.coldbottle();
        }
    }
}
