package com.xworkz.inheritence.internal.laptop;

public class GamingLaptop extends Laptop {
    public GamingLaptop() {
        super();
        System.out.println("Running non-arg constructor GamingLaptop");
    }
    @Override
    public void runSoftware() {
        System.out.println("Various software applications");
    }
    @Override
    public void providePortability() {
        System.out.println("Portable and easy to carry");
    }
    @Override
    public void connectToInternet() {
        System.out.println("Connects to the internet via WiFi or Ethernet");
    }
    @Override
    public void supportMultitasking() {
        System.out.println("Multitasking for productivity");
    }
    @Override
    public void longBatteryLife() {
        System.out.println("Battery for wireless usage");
    }
}
