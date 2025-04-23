package com.xworkz.inheritence.internal.wine;

public class RedWine extends Wine {
    public RedWine() {
        super();
        System.out.println("Running non-arg constructor RedWine");
    }
    @Override
    public void madeFromGrapes() {
        System.out.println("Wine is made");
    }
    @Override
    public void containsAlcohol() {
        System.out.println("Wine contains alcohol");
    }
    @Override
    public void improvesWithAge() {
        System.out.println("Wine improves in taste");
    }
    @Override
    public void servedInGlasses() {
        System.out.println("Served in special glasses");
    }
    @Override
    public void usedInCooking() {
        System.out.println("Used in cooking gourmet dishes");
    }
}
