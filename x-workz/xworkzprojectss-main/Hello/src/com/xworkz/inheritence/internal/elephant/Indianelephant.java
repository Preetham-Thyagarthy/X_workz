package com.xworkz.inheritence.internal.elephant;

public class Indianelephant {
    public void observe(Elephant elephant) {
        elephant.eat();
        elephant.drinkWater();
        elephant.trumpet();
        elephant.useTrunk();
        elephant.walkSlowly();

        if (elephant instanceof AfricanElephant) {
            System.out.println("Elephant is an instance of AfricanElephant");
            AfricanElephant african = (AfricanElephant) elephant;
            african.colors();
        }
    }
}
