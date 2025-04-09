package com.assesments.java;
public class City {
    String name;
    String mayor;
    int population;
    Ward[] wards;

    public City(String name, String mayor, int population, Ward[] wards) {
        this.name = name;
        this.mayor = mayor;
        this.population = population;
        this.wards = wards;
    }

    public void display() {
        System.out.println("      City: " + name + ", Mayor: " + mayor + ", Population: " + population);
        for (Ward ward : wards) {
            ward.display();
        }
    }
}