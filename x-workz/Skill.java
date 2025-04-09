package com.assesments.java;
public class Skill {
    String name;
    int proficiencyLevel;
    int yearsExperience;
    Experience experience;

    public Skill(String name, int proficiencyLevel, int yearsExperience, Experience experience) {
        this.name = name;
        this.proficiencyLevel = proficiencyLevel;
        this.yearsExperience = yearsExperience;
        this.experience = experience;
    }

    public void display() {
        System.out.println("        Skill: " + name + ", Proficiency: " + proficiencyLevel + "/10, Experience: " + yearsExperience + " years");
        experience.display();
    }
}