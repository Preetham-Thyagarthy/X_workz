package com.xworkz.inheritence.internal.charger;

public class Point {
    public void switchs(Charger charger) {
        charger.plug();
        charger.white();
        charger.small();
        charger.cPin();
        charger.phone();

        if (charger instanceof Wire) {
            System.out.println("Charger is an instance of Wire");
            Wire wire = (Wire) charger;
            wire.screen();
        }
    }
}
