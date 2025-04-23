package com.xworkz.inheritence.internal.apparatus;

public class Equipment {
    public void source(Apparatus apparatus){
        apparatus.powerOn();
        apparatus.powerOff();
        apparatus.consumeElectricity();
        apparatus.function();
        apparatus.brand();

        if(apparatus instanceof WashingMachine){
            System.out.println("Apparatus instance of washingmachine");
            WashingMachine wash=(WashingMachine) apparatus;
            wash.usage();
        }

    }
}
