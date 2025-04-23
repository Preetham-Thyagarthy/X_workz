package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.elephant.Elephant;
import com.xworkz.inheritence.internal.elephant.AfricanElephant;
import com.xworkz.inheritence.internal.elephant.Indianelephant;

public class ElephantRunner {
    public static void main(String[] args) {

        Elephant elephant = new Elephant();
        elephant.eat();
        elephant.drinkWater();
        elephant.trumpet();
        elephant.useTrunk();
        elephant.walkSlowly();
        System.out.println("**************************************");
        Elephant elephant1 = new AfricanElephant();
        elephant1.eat();
        elephant1.drinkWater();
        elephant1.trumpet();
        elephant1.useTrunk();
        elephant1.walkSlowly();

        System.out.println("**************************************");
        AfricanElephant africanElephant = new AfricanElephant();
        africanElephant.eat();
        africanElephant.drinkWater();
        africanElephant.trumpet();
        africanElephant.useTrunk();
        africanElephant.walkSlowly();

        System.out.println("************Casting example**************");
        Indianelephant indianelephant=new Indianelephant();
        indianelephant.observe(elephant);
        indianelephant.observe(elephant1);
        indianelephant.observe(africanElephant);
    }
}
