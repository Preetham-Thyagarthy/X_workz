package com.assesments.java;
public class PrimeMinister {
    String name;
    int age;
    String party;
    int termYears;
    Minister[] ministers;

    public PrimeMinister(String name, int age, String party, int termYears, Minister[] ministers) {
        this.name = name;
        this.age = age;
        this.party = party;
        this.termYears = termYears;
        this.ministers = ministers;
    }

    public void display() {
        System.out.println("Prime Minister: " + name + ", Age: " + age + ", Party: " + party + ", Term Years: " + termYears);
        for (Minister minister : ministers) {
            minister.display();
        }
    }
}