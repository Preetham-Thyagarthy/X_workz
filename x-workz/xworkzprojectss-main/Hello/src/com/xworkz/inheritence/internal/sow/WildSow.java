package com.xworkz.inheritence.internal.sow;

public class WildSow extends Sow {
    public WildSow() {
        super();
        System.out.println("Running non-arg constructor WildPig");
    }
    @Override
    public void eatEverything() {
        System.out.println("Omnivores and eat a variety of food");
    }
    @Override
    public void liveInMud() {
        System.out.println("Rolling in mud to keep cool");
    }
    @Override
    public void haveStrongSenseOfSmell() {
        System.out.println("Strong sense of smell");
    }
    @Override
    public void socialAnimals() {
        System.out.println("Social animals and live in groups");
    }
    @Override
    public void intelligent() {
        System.out.println("Highly intelligent animals");
    }
}
