package com.xworkz.inheritence.internal.country;

public class Nepal {
    public void nations(Country country) {
        country.name();
        country.population();
        country.culture();
        country.economy();
        country.government();

        if (country instanceof India) {
            System.out.println("Country is an instance of India");
            India india = (India) country;
            india.area();
        }
    }
}
