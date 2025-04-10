package com.xworkz.external;

public class Shirt {
    private String brand;
    private int cost;
    private String color;
    public  Shirt(String brand,int cost,String color){
        this.brand=brand;
        this.color=color;
        this.cost=cost;
    }
    public String toString(){
        return(" Brand:"+this.brand+" Color:"+this.color+" Cost"+this.cost);
    }

}


