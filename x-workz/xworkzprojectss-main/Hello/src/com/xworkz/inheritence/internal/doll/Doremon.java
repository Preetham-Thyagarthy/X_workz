package com.xworkz.inheritence.internal.doll;

public class Doremon {
    public void dollbox(Doll doll) {
        doll.play();
        doll.dressUp();
        doll.talk();
        doll.move();
        doll.collect();

        if (doll instanceof BarbieDoll) {
            System.out.println("Doll is an instance of BarbieDoll");
            BarbieDoll barbie = (BarbieDoll) doll;
            barbie.walking();
        }
    }
}
