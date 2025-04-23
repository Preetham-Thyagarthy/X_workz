package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.city.City;
import com.xworkz.inheritence.internal.city.NewYork;
import com.xworkz.inheritence.internal.city.Space;

public class CityRunner {
    public static void main(String[] args) {

        City city = new City();
        city.population();
        city.infrastructure();
        city.tourism();
        city.culture();
        city.economy();
        System.out.println("**************************************");
        City city1 = new NewYork();
        city1.population();
        city1.infrastructure();
        city1.tourism();
        city1.culture();
        city1.economy();

        System.out.println("**************************************");

        NewYork newYork = new NewYork();
        newYork.population();
        newYork.infrastructure();
        newYork.tourism();
        newYork.culture();
        newYork.economy();

        System.out.println("************Casting example**************");
        Space space=new Space();
        space.describe(city);
        space.describe(city1);
        space.describe(newYork);
    }
}
