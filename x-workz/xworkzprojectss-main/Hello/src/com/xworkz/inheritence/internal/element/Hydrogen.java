package com.xworkz.inheritence.internal.element;

public class Hydrogen {
    public void examine(Element element) {
        element.atomicNumber();
        element.symbol();
        element.state();
        element.bonding();
        element.reactivity();

        if (element instanceof Oxygen) {
            System.out.println("Element is an instance of Oxygen");
            Oxygen oxygen = (Oxygen) element;
            oxygen.table();
        }
    }
}
