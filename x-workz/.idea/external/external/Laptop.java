package com.xworkz.external;

import com.xworkz.internal.Gadgets;

public class Laptop extends Gadgets {
    private String brand;
    private char grade;
    private String color;
    public Laptop(String brand, char grade,String color){
        this.brand=brand;
        this.color=color;
        this.grade=grade;
    }
   public String toString(){
        return ("Brand: "+this.brand+" Grade: "+this.grade+" Color: "+this.color);
   }
}
