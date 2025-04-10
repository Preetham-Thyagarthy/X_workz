package com.xworkz.external;

import com.xworkz.internal.Bag;

public class TravelBag extends Bag {
    private String brand;
    private int cost;
    private char grade;
    public TravelBag(String brand,int cost,char grade){
        this.brand=brand;
        this.grade=grade;
        this.cost=cost;
    }

    @Override
    public String toString() {
        return(" Brand:"+this.brand+" Grade:"+this.grade+" Cost:"+this.cost);
    }
}


