package com.assesments.java;
public class Ward {
    String name;
    String counselor;
    int households;
    int businesses;

    public Ward(String name, String counselor, int households, int businesses) {
        this.name = name;
        this.counselor = counselor;
        this.households = households;
        this.businesses = businesses;
    }

    public void display() {
        System.out.println("        Ward: " + name + ", Counselor: " + counselor + ", Households: " + households + ", Businesses: " + businesses);
    }
}