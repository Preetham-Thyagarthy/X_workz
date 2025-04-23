package com.xworkz.inheritence.internal.planet;

public class Earth extends Planet {
    public Earth() {
        super();
        System.out.println("Running non-arg constructor Earth");
    }
    @Override
    public void orbitsSun() {
        System.out.println("Orbits the sun");
    }
    @Override
    public void hasGravity() {
        System.out.println("Has gravity");
    }
    @Override
    public void hasAtmosphere() {
        System.out.println("Has an atmosphere");
    }
    @Override
    public void supportsLife() {
        System.out.println("Support life");
    }
    @Override
    public void hasOceans() {
        System.out.println("Have oceans");
    }
}
