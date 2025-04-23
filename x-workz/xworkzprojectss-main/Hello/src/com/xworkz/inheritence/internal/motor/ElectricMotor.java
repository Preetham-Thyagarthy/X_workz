package com.xworkz.inheritence.internal.motor;

public class ElectricMotor extends Motor {
    public ElectricMotor() {
        super();
        System.out.println("Running non-arg constructor ElectricCar");
    }
    @Override
    public void usedForTransportation() {
        System.out.println("Transportation");
    }
    @Override
    public void hasFourWheels() {
        System.out.println("Wheels");
    }
    @Override
    public void poweredByEngine() {
        System.out.println("Internal combustion engine");
    }
    @Override
    public void comesInVariousModels() {
        System.out.println("Models and designs");
    }
    @Override
    public void hasComfortFeatures() {
        System.out.println("Features like AC, seats, and music systems");
    }
}
