package com.xworkz.external;

import com.xworkz.internal.Appu;

public class Dance extends Appu {
    private String name;
    private int steps;
    private char grade;
    public Dance(String name,int steps,char grade){
        this.name=name;
        this.steps=steps;
        this.grade=grade;
    }
    public String toString(){
        return (" Name:"+this.name+" Steps:"+this.steps+" Grade:"+this.grade);
    }
}
