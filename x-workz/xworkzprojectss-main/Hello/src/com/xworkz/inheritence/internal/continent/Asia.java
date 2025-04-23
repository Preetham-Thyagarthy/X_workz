package com.xworkz.inheritence.internal.continent;

public class Asia extends Continent {
    public Asia() {
        super();
        System.out.println("Running non-arg constructor Asia");
    }
    @Override

    public void countries() {
        System.out.println("Multiple countries");
    }
    @Override
    public void population() {
        System.out.println("Large population");
    }
    @Override
    public void culture() {
        System.out.println("Has diverse cultures");
    }
    @Override
    public void economy() {
        System.out.println("The global economy");
    }
    @Override
    public void climate() {
        System.out.println("Different climates");
    }
    public void language(){
        System.out.println("English language is spoken");
    }
}
