package com.xworkz.external;

import com.xworkz.internal.Toy;

public class Doll extends Toy {
    private String brand;
    private int number;
    private String location;
    public Doll(String brand,int number,String location){
        this.brand=brand;
        this.location=location;
        this.number=number;
    }
    public String toString()
    {
        return ("Brand: "+this.brand+" Location:" +this.location+" Number:"+this.number);
    }
}

