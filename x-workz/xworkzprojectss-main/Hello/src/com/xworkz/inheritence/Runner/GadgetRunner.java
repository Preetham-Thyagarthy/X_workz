package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.gadget.Gadget;
import com.xworkz.inheritence.internal.gadget.Tablet;

public class GadgetRunner {
    public static void main(String[] args) {



        Gadget gadget = new Gadget();
        gadget.powerOn();
        gadget.powerOff();
        gadget.charge();
        gadget.connect();
        gadget.brand();
        System.out.println("**************************************");
        Gadget gadgets = new Tablet();
        gadgets.powerOn();
        gadgets.powerOff();
        gadgets.charge();
        gadgets.connect();
        gadgets.brand();

        System.out.println("**************************************");

        Tablet tablet = new Tablet();
        tablet.powerOn();
        tablet.powerOff();
        tablet.charge();
        tablet.connect();
        tablet.brand();
    }
}
