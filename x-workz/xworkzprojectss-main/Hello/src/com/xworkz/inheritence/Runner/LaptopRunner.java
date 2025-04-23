package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.laptop.Laptop;
import com.xworkz.inheritence.internal.laptop.GamingLaptop;

public class LaptopRunner {
    public static void main(String[] args) {



        Laptop laptop = new Laptop();
        laptop.runSoftware();
        laptop.providePortability();
        laptop.connectToInternet();
        laptop.supportMultitasking();
        laptop.longBatteryLife();

        System.out.println("**************************************");
        Laptop lap = new GamingLaptop();
        lap.runSoftware();
        lap.providePortability();
        lap.connectToInternet();
        lap.supportMultitasking();
        lap.longBatteryLife();



        System.out.println("**************************************");
        GamingLaptop gamingLaptop = new GamingLaptop();
        gamingLaptop.runSoftware();
        gamingLaptop.providePortability();
        gamingLaptop.connectToInternet();
        gamingLaptop.supportMultitasking();
        gamingLaptop.longBatteryLife();
    }
}
