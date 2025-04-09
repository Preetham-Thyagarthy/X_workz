package com.assesments.java;
public class Portfolio {
    String name;
    String category;
    int budget;
    Detail detail;

    public Portfolio(String name, String category, int budget, Detail detail) {
        this.name = name;
        this.category = category;
        this.budget = budget;
        this.detail = detail;
    }

    public void display() {
        System.out.println("    Portfolio: " + name + ", Category: " + category + ", Budget: $" + budget + "M");
        detail.display();
    }
}