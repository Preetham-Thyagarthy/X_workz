package com.xworkz.external;

import com.xworkz.internal.App;

public class Facebook extends App {
    private String name;
    private int number;
    private char grade;
    public Facebook(String name,int number,char grade){
        this.name=name;
        this.number=number;
        this.grade=grade;
    }
    public String toString(){
        return (" Name:"+this.name+" No:"+this.number+" Grade:"+this.grade);
    }
}

