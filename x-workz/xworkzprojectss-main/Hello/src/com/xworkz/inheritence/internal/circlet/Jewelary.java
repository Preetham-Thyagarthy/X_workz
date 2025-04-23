package com.xworkz.inheritence.internal.circlet;

public class Jewelary {
    public void checkCirclet(Circlet circlet) {
        circlet.size();
        circlet.color();
        circlet.shape();
        circlet.matel();
        circlet.quality();

        if (circlet instanceof Type) {
            System.out.println("Circlet is an instance of Type");
            Type typeCirclet = (Type) circlet;
            typeCirclet.material();
        }
    }
}
