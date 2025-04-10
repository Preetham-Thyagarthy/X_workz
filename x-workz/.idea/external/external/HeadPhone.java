package com.xworkz.external;

import com.xworkz.internal.Gadgets;

public class HeadPhone extends Gadgets {
    private String color;
    private int weight;
    private char grade;
    public HeadPhone(String color,int weight,char grade){
        this.color=color;
        this.weight=weight;
        this.grade=grade;
    }
    public String toString(){
        return(" Color:"+this.color+" Weight:"+this.weight+" Grade:"+this.grade);

    }
}


