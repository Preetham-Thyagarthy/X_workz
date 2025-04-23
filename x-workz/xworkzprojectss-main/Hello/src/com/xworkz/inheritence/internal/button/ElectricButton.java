package com.xworkz.inheritence.internal.button;

public class ElectricButton extends Button {
    public ElectricButton() {
        super();
        System.out.println("Running non-arg constructor ElectricSwitch");
    }
    @Override
    public void turnOn() {
        System.out.println("Turns on");
    }
    @Override
    public void turnOff() {
        System.out.println("Turns off");
    }
    @Override
    public void saveElectricity() {
        System.out.println("Saving electricity");
    }
    @Override
    public void availableInVariousDesigns() {
        System.out.println("Various designs");
    }
    @Override
    public void usedInHomes() {
        System.out.println("Used in homes");
    }
    public void tvremote(){
        System.out.println("Its use as the tv remote");
    }
}
