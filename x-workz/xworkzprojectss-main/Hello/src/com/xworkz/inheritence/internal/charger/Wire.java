package com.xworkz.inheritence.internal.charger;

public class Wire extends Charger{
    public Wire(){
        super();
        System.out.println("running non-arg const Wire");
    }
    @Override
    public void plug()
    {
        System.out.println("Charger plugged");

    }
    @Override
    public void white(){
        System.out.println("Charger color is white");
    }
    @Override
    public void small(){
        System.out.println("Charger is small");
    }
    @Override
    public void cPin(){
        System.out.println("bPin Charger");
    }
    @Override
    public void phone(){
        System.out.println("Charger for laptop,phone");
    }

    public void screen(){
        System.out.println("Screening of the phone");
    }
}
