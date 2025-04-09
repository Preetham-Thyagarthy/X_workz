package com.assesments.java;
public class Detail {
    String description;
    String authority;
    String policies;
    int activeProjects;

    public Detail(String description, String authority, String policies, int activeProjects) {
        this.description = description;
        this.authority = authority;
        this.policies = policies;
        this.activeProjects = activeProjects;
    }

    public void display() {
        System.out.println("      Detail: " + description + ", Authority: " + authority + ", Policies: " + policies + ", Active Projects: " + activeProjects);
    }
}