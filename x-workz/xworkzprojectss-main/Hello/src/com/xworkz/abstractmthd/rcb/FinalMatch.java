package com.xworkz.abstractmthd.rcb;

public class FinalMatch extends Match{
    public FinalMatch(int score,String color,boolean win){
        super(score,color,win);
    }

    public void display(){
        System.out.println("The match of RCB has status: "+score+", "+color+", "+win);
    }
}
