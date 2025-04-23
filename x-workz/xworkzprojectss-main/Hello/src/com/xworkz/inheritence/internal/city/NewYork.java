package com.xworkz.inheritence.internal.city;

public class NewYork extends City {
    public NewYork() {
        super();
        System.out.println("Running non-arg constructor NewYork");
    }
    @Override
    public void population() {
        System.out.println("Has Population");
    }
    @Override
    public void infrastructure() {
        System.out.println("Large infrastructure");
    }
    @Override
    public void tourism() {
        System.out.println("Attracts tourists");
    }
    @Override
    public void culture() {
        System.out.println("Have diverse culture");
    }
    @Override
    public void economy() {
        System.out.println("Has an economy");
    }
    public void area(){
        System.out.println("Area is very vast");
    }
}
