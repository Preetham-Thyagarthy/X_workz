package com.xworkz.external;

import com.xworkz.internal.School;

public class College extends School {
    private String name;
    private int number;
    private char grade;
    public College(String name,int number,char grade){
        this.name=name;
        this.number=number;
        this.grade=grade;
    }
    public String toString(){
        return (" Name:"+this.name+" No:"+this.number+" Grade:"+this.grade);
    }
}

