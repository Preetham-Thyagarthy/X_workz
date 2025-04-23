package com.xworkz.inheritence.internal.bike;

public class Ride {
    public void approve(Bike bike) {
        bike.usedForTransportation();
        bike.hasTwoWheels();
        bike.runsOnFuel();
        bike.requiresHelmet();
        bike.comesInDifferentModels();

        if (bike instanceof SportsBike) {
            System.out.println("Bike is an instance of SportsBike");
            SportsBike sports = (SportsBike) bike;
            sports.fastfastly();
        }
    }
}
