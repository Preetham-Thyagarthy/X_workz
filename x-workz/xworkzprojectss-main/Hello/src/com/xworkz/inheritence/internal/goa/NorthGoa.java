package com.xworkz.inheritence.internal.goa;

public class NorthGoa extends Goa {
    public NorthGoa() {
        super();
        System.out.println("Running non-arg constructor NorthGoa");
    }
    @Override
    public void visitBeach() {
        System.out.println("Beautiful beaches of Goa");
    }
    @Override
    public void enjoyNightlife() {
        System.out.println("Vibrant nightlife of Goa");
    }
    @Override
    public void exploreForts() {
        System.out.println("Historic forts in Goa");
    }
    @Override
    public void tasteSeafood() {
        System.out.println("Delicious seafood");
    }
    @Override
    public void relax() {
        System.out.println("Peaceful environment");
    }
    public void temples(){
        System.out.println("In south Goa there are temples");
    }
}
