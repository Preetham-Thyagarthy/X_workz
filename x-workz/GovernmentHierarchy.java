package com.assesments.java;
public class GovernmentHierarchy {
    public static void main(String[] args) {
        Country country = new Country("Republic of Java", "Asia", 50000000, "Java Dollar", new PrimeMinister("James Wilson", 60, "Democratic Party", 5, new Minister[]{}), new State[]{});
        country.display();
    }
}