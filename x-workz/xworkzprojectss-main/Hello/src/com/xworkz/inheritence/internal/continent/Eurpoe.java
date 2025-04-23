package com.xworkz.inheritence.internal.continent;

public class Eurpoe {
    public void map(Continent continent) {
        continent.countries();
        continent.population();
        continent.culture();
        continent.economy();
        continent.climate();

        if (continent instanceof Asia) {
            System.out.println("Continent is an instance of Asia");
            Asia asia = (Asia) continent;
            asia.language();
        }
    }
}
