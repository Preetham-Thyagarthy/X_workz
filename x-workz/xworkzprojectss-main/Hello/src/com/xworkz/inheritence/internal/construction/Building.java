package com.xworkz.inheritence.internal.construction;

public class Building {
    public void builder(Construction construction) {
        construction.shelter();
        construction.structure();
        construction.floors();
        construction.foundation();

        if (construction instanceof House) {
            System.out.println("Construction is an instance of House");
            House house = (House) construction;
            house.rooms();
        }
    }
}
