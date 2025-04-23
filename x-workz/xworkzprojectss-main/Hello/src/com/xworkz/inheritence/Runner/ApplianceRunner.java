package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.apparatus.Apparatus;
import com.xworkz.inheritence.internal.apparatus.Equipment;
import com.xworkz.inheritence.internal.apparatus.WashingMachine;

public class ApplianceRunner {
    public static void main(String[] args) {

        Apparatus apar=new Apparatus();
        apar.powerOn();
        apar.powerOff();
        apar.consumeElectricity();
        apar.function();
        apar.brand();

        System.out.println("**************************************");

        Apparatus apparatus = new WashingMachine();
        apparatus.powerOn();
        apparatus.powerOff();
        apparatus.consumeElectricity();
        apparatus.function();
        apparatus.brand();

        System.out.println("**************************************");

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.powerOn();
        washingMachine.powerOff();
        washingMachine.consumeElectricity();
        washingMachine.function();
        washingMachine.brand();

        System.out.println("*************Casting example*****************");
        Equipment equipment=new Equipment();
        equipment.source(apar);
        equipment.source(apparatus);
        equipment.source(washingMachine);

    }
}
