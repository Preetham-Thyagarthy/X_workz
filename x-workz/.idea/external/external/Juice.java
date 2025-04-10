package com.xworkz.external;

import com.xworkz.internal.Liquid;

public class Juice extends Liquid {
    private String brand;
    private int cost;
    private char grade;
    public Juice(String brand, int cost, char grade){
        this.cost=cost;
        this.grade=grade;
        this.brand=brand;
    }
    public String toString()
    {
        return("Brand:"+this.brand+" Cost:"+this.cost+" Grade:"+this.grade);
    }
}
