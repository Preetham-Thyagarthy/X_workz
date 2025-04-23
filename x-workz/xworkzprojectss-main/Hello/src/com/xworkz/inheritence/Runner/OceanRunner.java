package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.ocean.Ocean;
import com.xworkz.inheritence.internal.ocean.Pacific;

public class OceanRunner {
    public static void main(String[] args) {



        Ocean ocean = new Ocean();
        ocean.depth();
        ocean.marineLife();
        ocean.waves();
        ocean.temperature();
        ocean.tides();

        System.out.println("**************************************");
        Ocean oceans = new Pacific();
        oceans.depth();
        oceans.marineLife();
        oceans.waves();
        oceans.temperature();
        oceans.tides();


        System.out.println("**************************************");

        Pacific pacific = new Pacific();
        pacific.depth();
        pacific.marineLife();
        pacific.waves();
        pacific.temperature();
        pacific.tides();
    }
}
