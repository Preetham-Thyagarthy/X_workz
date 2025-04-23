package com.xworkz.inheritence.internal.chapple;

public class Foot {
    public void wearing(Chapple chapple) {
        chapple.wear();
        chapple.walk();
        chapple.grip();
        chapple.comfort();

        if (chapple instanceof FlipFlop) {
            System.out.println("Chapple is an instance of FlipFlop");
            FlipFlop flipFlop = (FlipFlop) chapple;
            flipFlop.jump();
        }
    }
}
