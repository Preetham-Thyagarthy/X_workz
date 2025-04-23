package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.metal.Metal;
import com.xworkz.inheritence.internal.metal.Gold;

public class MetalRunner {
    public static void main(String[] args) {


        Metal metal = new Metal();
        metal.conductivity();
        metal.durability();
        metal.malleability();
        metal.density();
        metal.corrosion();
        System.out.println("**************************************");
        Metal metals = new Gold();
        metals.conductivity();
        metals.durability();
        metals.malleability();
        metals.density();
        metals.corrosion();



        System.out.println("**************************************");

        Gold gold = new Gold();
        gold.conductivity();
        gold.durability();
        gold.malleability();
        gold.density();
        gold.corrosion();
    }
}
