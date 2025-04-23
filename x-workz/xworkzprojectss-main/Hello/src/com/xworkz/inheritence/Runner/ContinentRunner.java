package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.continent.Continent;
import com.xworkz.inheritence.internal.continent.Asia;
import com.xworkz.inheritence.internal.continent.Eurpoe;
import com.xworkz.inheritence.internal.couch.Businesscouch;

public class ContinentRunner {
    public static void main(String[] args) {

        Continent continent = new Continent();
        continent.countries();
        continent.population();
        continent.culture();
        continent.economy();
        continent.climate();
        System.out.println("**************************************");

        Continent continent1 = new Asia();
        continent1.countries();
        continent1.population();
        continent1.culture();
        continent1.economy();
        continent1.climate();

        System.out.println("**************************************");

        Asia asia = new Asia();
        asia.countries();
        asia.population();
        asia.culture();
        asia.economy();
        asia.climate();

        System.out.println("************Casting example**************");
        Eurpoe eurpoe=new Eurpoe();
        eurpoe.map(continent);
        eurpoe.map(continent1);
        eurpoe.map(asia);
    }
}
