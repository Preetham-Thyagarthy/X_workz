package com.xworkz.Access;

public class Instancemethods {
    public int age=22;
    String name="Ananya";
    private long phone=2587496;

    public void printage(){
        System.out.println("Age is:"+this.age);
        printname();
        printphone();
    }
    void printname(){
        System.out.println("Name is:"+this.name);
    }
    private void printphone(){
        System.out.println("Phone number is:"+this.phone);
    }

}
