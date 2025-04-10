package com.xworkz.external;

import com.xworkz.internal.Toy;

public class Cindrella extends Toy {
    private String brand;
    private int number;
    private String location;
    public Cindrella(String brand,int number,String location){
        this.brand=brand;
        this.location=location;
        this.number=number;
    }
    public String toString()
    {
        return ("Brand: "+this.brand+" Location:" +this.location+" Number:"+this.number);
    }
}
