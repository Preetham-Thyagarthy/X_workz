package com.assesments.java;
public class State {
    String name;
    String governor;
    int population;
    District[] districts;

    public State(String name, String governor, int population, District[] districts) {
        this.name = name;
        this.governor = governor;
        this.population = population;
        this.districts = districts;
    }

    public void display() {
        System.out.println("  State: " + name + ", Governor: " + governor + ", Population: " + population);
        for (District district : districts) {
            district.display();
        }
    }
}