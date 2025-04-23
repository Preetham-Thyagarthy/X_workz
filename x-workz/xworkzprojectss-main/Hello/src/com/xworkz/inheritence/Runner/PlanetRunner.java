package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.planet.Planet;
import com.xworkz.inheritence.internal.planet.Earth;

public class PlanetRunner {
    public static void main(String[] args) {



        Planet planet = new Planet();
        planet.orbitsSun();
        planet.hasGravity();
        planet.hasAtmosphere();
        planet.supportsLife();
        planet.hasOceans();
        System.out.println("**************************************");
        Planet planet2 = new Earth();
        planet2.orbitsSun();
        planet2.hasGravity();
        planet2.hasAtmosphere();
        planet2.supportsLife();
        planet2.hasOceans();

        System.out.println("-----------");

        Earth earth = new Earth();
        earth.orbitsSun();
        earth.hasGravity();
        earth.hasAtmosphere();
        earth.supportsLife();
        earth.hasOceans();
    }
}
