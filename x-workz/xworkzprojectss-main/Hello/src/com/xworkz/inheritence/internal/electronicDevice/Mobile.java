package com.xworkz.inheritence.internal.electronicDevice;

public class Mobile extends ElectronicDevice{

        public Mobile() {
            super();
            System.out.println("Running non-arg constructor of Mobile");
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
    public void battery() {
        System.out.println("Has a battery");
    }
    @Override
    public void charge() {
        System.out.println("Is charging");
    }
    public void fetures(){
        System.out.println("There are many features in the mobile");
    }
    }


