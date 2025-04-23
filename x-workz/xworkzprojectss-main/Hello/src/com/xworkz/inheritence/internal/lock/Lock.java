package com.xworkz.inheritence.internal.lock;

public class Lock extends Key{
    public Lock(){
        super();
        System.out.println("running non-arg const Lock");
    }
    @Override
    public void open(){
        System.out.println("opening");
    }
    @Override
    public void white(){
        System.out.println("color is white");
    }
    @Override
    public void small(){
        System.out.println("smalling");
    }
    @Override
    public void close(){
        System.out.println("closeing");
    }
    @Override
    public void big(){
        System.out.println("Key is big");
    }
}
