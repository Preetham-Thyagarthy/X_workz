package com.assesments.java;
public class Personal {
    String name;
    int age;
    String rank;
    int yearsOfService;
    Skill[] skills;

    public Personal(String name, int age, String rank, int yearsOfService, Skill[] skills) {
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.yearsOfService = yearsOfService;
        this.skills = skills;
    }

    public void display() {
        System.out.println("      Personnel: " + name + ", Age: " + age + ", Rank: " + rank + ", Years of Service: " + yearsOfService);
        for (Skill skill : skills) {
            skill.display();
        }
    }
}