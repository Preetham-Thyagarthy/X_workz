package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.fruit.Apple;
import com.xworkz.inheritence.internal.fruit.Fruit;
import com.xworkz.inheritence.internal.fruit.Orange;

public class FruitRunner {
    public static void main(String[] args) {


        Fruit fruit=new Fruit();
        fruit.taste();
        fruit.color();
        fruit.nutrients();
        fruit.seasonal();
        System.out.println("**************************************");
        Fruit fruit1 =new Apple();
        fruit1.taste();
        fruit1.color();
        fruit1.nutrients();
        fruit1.seasonal();

        System.out.println("**************************************");
        Apple apple = new Apple();
        apple.taste();
        apple.color();
        apple.nutrients();
        apple.seasonal();

        System.out.println("************Casting example**************");
        Orange orange=new Orange();
        orange.typesoffruits(fruit);
        orange.typesoffruits(fruit1);
        orange.typesoffruits(apple);
    }
}
