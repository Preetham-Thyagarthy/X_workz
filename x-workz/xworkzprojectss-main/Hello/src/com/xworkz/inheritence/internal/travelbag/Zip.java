package com.xworkz.inheritence.internal.travelbag;

public class Zip extends Travelbag {
    public Zip(){
        System.out.println("running non-arg const Zip");
    }
    @Override
    public void open(){
        System.out.println("open bag");
    }
    @Override
    public void close(){
        System.out.println("close bag");
    }
    @Override
    public void small(){
        System.out.println("small bag");
    }
    @Override
    public void color(){
        System.out.println("color bag");
    }
    @Override
    public void noOfZip(){
        System.out.println("noOfZip bag");
    }
}
