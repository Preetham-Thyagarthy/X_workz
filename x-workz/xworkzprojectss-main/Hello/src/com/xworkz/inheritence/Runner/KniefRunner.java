package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.knief.Knief;
import com.xworkz.inheritence.internal.knief.Device;

public class KniefRunner {
    public static void main(String[] args) {


        Knief knief = new Knief();
        knief.usedForCutting();
        knief.hasSharpBlades();
        knief.usedInHousehold();
        knief.comesInDifferentSizes();
        knief.requiresProperHandling();
        System.out.println("**************************************");
        Knief knf = new Device();
        knf.usedForCutting();
        knf.hasSharpBlades();
        knf.usedInHousehold();
        knf.comesInDifferentSizes();
        knf.requiresProperHandling();

        System.out.println("**************************************");
        Device device = new Device();
        device.usedForCutting();
        device.hasSharpBlades();
        device.usedInHousehold();
        device.comesInDifferentSizes();
        device.requiresProperHandling();
    }
}
