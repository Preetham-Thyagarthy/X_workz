package com.xworkz.inheritence.internal.bird;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Eagle extends Bird {
    public Eagle() {
        super();
        System.out.println("Running non-arg constructor Eagle");
    }
    @Override
    public void fly() {
        System.out.println("Flying bird");
    }
    @Override
    public void feathers() {
        System.out.println("Have feathers");
    }
    @Override
    public void laysEggs() {
        System.out.println("Eggs are layed");
    }
    @Override
    public void sound() {
        System.out.println("Makes sounds");
    }
    @Override
    public void vision() {
        System.out.println("Have sharp vision");
    }
    public void neck(){
        System.out.println("Neck of the bird");
    }
}
