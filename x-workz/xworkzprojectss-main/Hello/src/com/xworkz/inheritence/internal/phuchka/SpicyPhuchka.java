package com.xworkz.inheritence.internal.phuchka;

public class SpicyPhuchka extends Phuchka {
    public SpicyPhuchka() {
        super();
        System.out.println("Running non-arg constructor SpicyPanipuri");
    }
    @Override
    public void popularStreetFood() {
        System.out.println("Popular street food");
    }
    @Override
    public void madeOfCrispyPuri() {
        System.out.println("Consists of crispy puris");
    }
    @Override
    public void comesWithVariety() {
        System.out.println("Comes in different flavors");
    }
    @Override
    public void servedWithFilling() {
        System.out.println("Served with potato or chickpea filling");
    }
    @Override
    public void bestEatenFresh() {
        System.out.println("Best eaten immediately after preparation");
    }
}
