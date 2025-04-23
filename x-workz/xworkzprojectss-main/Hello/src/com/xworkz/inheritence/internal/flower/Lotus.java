package com.xworkz.inheritence.internal.flower;

public class Lotus {
    public void variety(Flower flower) {
        flower.bloom();
        flower.fragrance();
        flower.color();
        flower.petals();
        flower.pollination();

        if (flower instanceof Rose) {
            System.out.println("This is an instance of Rose");
            Rose rose = (Rose) flower;
            rose.petels();
        }
    }
}
