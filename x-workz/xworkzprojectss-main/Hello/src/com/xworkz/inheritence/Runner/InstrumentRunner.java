package com.xworkz.inheritence.Runner;


import com.xworkz.inheritence.internal.instrument.Guitar;
import com.xworkz.inheritence.internal.instrument.Instrument;

public class InstrumentRunner {
    public static void main(String[] args) {

        Instrument instrument=new Instrument();
        instrument.play();
        instrument.sound();
        instrument.type();
        instrument.maintenance();
        instrument.brand();
        System.out.println("**************************************");
        Instrument instruments =new Guitar();
        instruments.play();
        instruments.sound();
        instruments.type();
        instruments.maintenance();
        instruments.brand();

        System.out.println("**************************************");

        Guitar guitar=new Guitar();
        guitar.play();
        guitar.sound();
        guitar.type();
        guitar.maintenance();
        guitar.brand();
    }
}
