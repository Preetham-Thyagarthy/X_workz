package com.assesments.java;
public class Country {
    String name;
    String continent;
    int population;
    String currency;
    PrimeMinister primeMinister;
    State[] states;

    public Country(String name, String continent, int population, String currency, PrimeMinister primeMinister, State[] states) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.currency = currency;
        this.primeMinister = primeMinister;
        this.states = states;
    }

    public void display() {
        System.out.println("Country: " + name + ", Continent: " + continent + ", Population: " + population + ", Currency: " + currency);
        primeMinister.display();
        for (State state : states) {
            state.display();
        }
    }
}