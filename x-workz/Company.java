package com.assesments.java;
public class Company {
    String name;
    String industry;
    int employees;
    int revenue;

    public Company(String name, String industry, int employees, int revenue) {
        this.name = name;
        this.industry = industry;
        this.employees = employees;
        this.revenue = revenue;
    }

    public void display() {
        System.out.println("            Company: " + name + ", Industry: " + industry + ", Employees: " + employees + ", Revenue: $" + revenue + "M");
    }
}