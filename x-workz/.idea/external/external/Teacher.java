package com.xworkz.external;

public class Teacher {
    private String name;
    private int number;
    private char grade;
    public Teacher(String name,int number,char grade){
        this.name=name;
        this.number=number;
        this.grade=grade;
    }
    public String toString(){
        return (" Name:"+this.name+" No:"+this.number+" Grade:"+this.grade);
    }
}

