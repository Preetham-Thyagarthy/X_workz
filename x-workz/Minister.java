package com.assesments.java;
public class Minister {
    String name;
    int age;
    String department;
    int experienceYears;
    PersonalAssistant assistant;
    Portfolio[] portfolios;

    public Minister(String name, int age, String department, int experienceYears, PersonalAssistant assistant, Portfolio[] portfolios) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.experienceYears = experienceYears;
        this.assistant = assistant;
        this.portfolios = portfolios;
    }

    public void display() {
        System.out.println("  Minister: " + name + ", Age: " + age + ", Department: " + department + ", Experience: " + experienceYears + " years");
        assistant.display();
        for (Portfolio portfolio : portfolios) {
            portfolio.display();
        }
    }
}