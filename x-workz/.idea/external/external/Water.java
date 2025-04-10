package com.xworkz.external;

import com.xworkz.internal.Liquid;

public class Water extends Liquid {
    private String brand;
    private int cost;
    private char grade;
    public Water(String brand, int cost, char grade){
        this.cost=cost;
        this.grade=grade;
        this.brand=brand;
    }
    public String toString()
    {
        return("Brand:"+this.brand+" Cost:"+this.cost+" Grade:"+this.grade);
    }

}

