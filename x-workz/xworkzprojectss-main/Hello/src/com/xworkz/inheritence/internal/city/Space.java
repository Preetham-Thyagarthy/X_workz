package com.xworkz.inheritence.internal.city;

public class Space {
    public void describe(City city) {
        city.population();
        city.infrastructure();
        city.tourism();
        city.culture();
        city.economy();

        if (city instanceof NewYork) {
            System.out.println("City is an instance of NewYork");
            NewYork newYork = (NewYork) city;
            newYork.area();
        }
    }
}
