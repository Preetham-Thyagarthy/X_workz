package com.xworkz.inheritence.internal.country;

public class India extends Country {
    public India() {
        super();
        System.out.println("Running non-arg constructor India");
    }
    @Override
    public void name() {
        System.out.println("Country name");
    }
    @Override
    public void population() {
        System.out.println("Countries population");
    }
    @Override
    public void culture() {
        System.out.println("Culture of country");
    }
    @Override
    public void economy() {
        System.out.println("Countries economy");
    }
    @Override
    public void government() {
        System.out.println("Government of India");
    }
    public void area(){
        System.out.println("Acres of areas are used");
    }
}
