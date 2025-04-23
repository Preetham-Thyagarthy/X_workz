package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.bike.Bike;
import com.xworkz.inheritence.internal.bike.Ride;
import com.xworkz.inheritence.internal.bike.SportsBike;

public class BikeRunner {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.usedForTransportation();
        bike.hasTwoWheels();
        bike.runsOnFuel();
        bike.requiresHelmet();
        bike.comesInDifferentModels();

        System.out.println("**************************************");

        Bike bike1 = new SportsBike();
        bike1.usedForTransportation();
        bike1.hasTwoWheels();
        bike1.runsOnFuel();
        bike1.requiresHelmet();
        bike1.comesInDifferentModels();

        System.out.println("**************************************");
        SportsBike sportsBike = new SportsBike();
        sportsBike.usedForTransportation();
        sportsBike.hasTwoWheels();
        sportsBike.runsOnFuel();
        sportsBike.requiresHelmet();
        sportsBike.comesInDifferentModels();

        System.out.println("************Casting example**************");
        Ride ride=new Ride();
        ride.approve(bike);
        ride.approve(bike1);
        ride.approve(sportsBike);
    }
}
