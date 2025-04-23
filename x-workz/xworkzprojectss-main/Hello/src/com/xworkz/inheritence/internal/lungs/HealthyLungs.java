package com.xworkz.inheritence.internal.lungs;

public class HealthyLungs extends Lungs {
    public HealthyLungs() {
        super();
        System.out.println("Running non-arg constructor HealthyHeart");
    }
    @Override
    public void pumpsBlood() {
        System.out.println("The lungs pumps blood");
    }
    @Override
    public void beatsContinuously() {
        System.out.println("The heart beats continuously");
    }
    @Override
    public void suppliesOxygen() {
        System.out.println("The heart supplies");
    }
    @Override
    public void removesWaste() {
        System.out.println("The heart helps remove waste products");
    }
    @Override
    public void worksInCirculatorySystem() {
        System.out.println("The heart is a vital organ");
    }
}
