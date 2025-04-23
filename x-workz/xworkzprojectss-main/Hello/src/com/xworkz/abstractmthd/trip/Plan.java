package com.xworkz.abstractmthd.trip;

public abstract class Plan {
    int days;
    String places;
    double price;
    boolean approval;

    Plan(int days){
        this.days=days;
    }
    Plan(int days,String places){
        this.days=days;
        this.places=places;
    }
    Plan(int days,String places,double price,boolean approval){
        this.days=days;
        this.places=places;
        this.price=price;
        this.approval=approval;
    }
}
