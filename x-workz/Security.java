package com.assesments.java;
public class Security {
    int numberOfPersonnel;
    String securityType;
    int budget;
    Personal[] personnel;

    public Security(int numberOfPersonnel, String securityType, int budget, Personal[] personnel) {
        this.numberOfPersonnel = numberOfPersonnel;
        this.securityType = securityType;
        this.budget = budget;
        this.personnel = personnel;
    }

    public void display() {
        System.out.println("    Security: Type: " + securityType + ", Personnel Count: " + numberOfPersonnel + ", Budget: $" + budget + "M");
        for (Personal p : personnel) {
            p.display();
        }
    }
}