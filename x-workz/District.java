package com.assesments.java;
public class District {
    String name;
    String collector;
    int area;
    City[] cities;

    public District(String name, String collector, int area, City[] cities) {
        this.name = name;
        this.collector = collector;
        this.area = area;
        this.cities = cities;
    }

    public void display() {
        System.out.println("    District: " + name + ", Collector: " + collector + ", Area: " + area + " sq km");
        for (City city : cities) {
            city.display();
        }
    }
}