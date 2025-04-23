package com.xworkz.inheritence.internal.earpods;

public class WirelessEarpods extends Earpods {
    public WirelessEarpods() {
        super();
        System.out.println("Running non-arg constructor WirelessEarpods");
    }
    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }
    @Override
    public void charge() {
        System.out.println("Being charged");
    }
    @Override
    public void connect() {
        System.out.println("Connecting via Bluetooth");
    }
    public void wireless(){
        System.out.println("There are wireless pods like blootooth");
    }
}
