package com.assesments.java;
public class PersonalAssistant {
    String name;
    int age;
    String qualification;
    int yearsOfExperience;

    public PersonalAssistant(String name, int age, String qualification, int yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void display() {
        System.out.println("    Personal Assistant: " + name + ", Age: " + age + ", Qualification: " + qualification + ", Experience: " + yearsOfExperience + " years");
    }
}