package com.xworkz.inheritence.internal.construction;

public class House extends Construction {
    public House(){
        super();
        System.out.println("running non-arg cont House");
    }
    @Override
    public void shelter() {
        System.out.println("Provides shelter");
    }
    @Override
    public void structure() {
        System.out.println("Structure of building");
    }
    @Override
    public void floors() {
        System.out.println("Have floors");
    }
    @Override
    public void foundation() {
        System.out.println("Has a foundation");
    }
    public void rooms(){
        System.out.println("There are 4-5 rooms");
    }
}
