package com.xworkz.inheritence.internal.worship;

public class HinduWorship extends Worship {
    public HinduWorship() {
        super();
        System.out.println("Running non-arg constructor HinduTemple");
    }
    @Override
    public void worship() {
        System.out.println("People come to worship");
    }
    @Override
    public void meditate() {
        System.out.println("Meditating in the worship");
    }
    @Override
    public void lightLamp() {
        System.out.println("Lighting lamps");
    }
    @Override
    public void offerPrayers() {
        System.out.println("Offering prayers");
    }
    @Override
    public void ringBell() {
        System.out.println("Ringing the bell");
    }
}
