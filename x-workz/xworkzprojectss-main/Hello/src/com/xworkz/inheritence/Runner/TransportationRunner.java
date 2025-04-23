package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.transportation.Transportation;
import com.xworkz.inheritence.internal.transportation.Train;

public class TransportationRunner {
    public static void main(String[] args) {


        Transportation transport = new Transportation();
        transport.move();
        transport.speed();
        transport.fuel();
        transport.capacity();
        transport.type();
        System.out.println("**************************************");
        Transportation transport1 = new Train();
        transport1.move();
        transport1.speed();
        transport1.fuel();
        transport1.capacity();
        transport1.type();

        System.out.println("**************************************");

        Train train = new Train();
        train.move();
        train.speed();
        train.fuel();
        train.capacity();
        train.type();

        System.out.println("**************************************");
    }
}
