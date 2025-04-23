package com.xworkz.inheritence.internal.apparatus;

import java.sql.SQLOutput;

public class WashingMachine extends Apparatus {
    public WashingMachine() {
        super();
        System.out.println("Running non-arg constructor WashingMachine");
    }
    @Override
    public void powerOn() {
        System.out.println("Powered on");
    }
    @Override
    public void powerOff() {

        System.out.println("Powered off");
    }
    @Override
    public void consumeElectricity() {

        System.out.println("Consumes electricity");
    }
    @Override
    public void function() {

        System.out.println("Performs a function");
    }
    @Override
    public void brand() {

        System.out.println("Have a brand");
    }

    public void usage(){
        System.out.println("Usage is good and in different forms");
    }
}
