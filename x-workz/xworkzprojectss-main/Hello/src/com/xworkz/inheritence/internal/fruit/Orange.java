package com.xworkz.inheritence.internal.fruit;

public class Orange {
    public void typesoffruits(Fruit fruit) {
        fruit.taste();
        fruit.color();
        fruit.nutrients();
        fruit.seasonal();

        if (fruit instanceof Apple) {
            System.out.println("Fruit is an instance of Apple");
            Apple apple = (Apple) fruit;
            apple.protien();
        }
    }
}
