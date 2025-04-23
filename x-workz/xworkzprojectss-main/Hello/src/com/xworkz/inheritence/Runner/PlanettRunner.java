package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.planet.Planet;
import com.xworkz.inheritence.internal.planet.Earth;

public class PlanettRunner {
    public static void main(String[] args) {


        Planet planet = new Planet();
        planet.orbitsSun();
        planet.hasGravity();
        planet.hasAtmosphere();
        planet.supportsLife();
        planet.hasOceans();
        System.out.println("**************************************");
        Planet planet1 = new Earth();
        planet1.orbitsSun();
        planet1.hasGravity();
        planet1.hasAtmosphere();
        planet1.supportsLife();
        planet1.hasOceans();

        System.out.println("-----------");

        Earth earth = new Earth();
        earth.orbitsSun();
        earth.hasGravity();
        earth.hasAtmosphere();
        earth.supportsLife();
        earth.hasOceans();
    }
}
