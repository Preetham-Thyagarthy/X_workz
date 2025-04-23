package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.flower.Flower;
import com.xworkz.inheritence.internal.flower.Lotus;
import com.xworkz.inheritence.internal.flower.Rose;

public class FlowerRunner {
    public static void main(String[] args) {

        Flower flower = new Flower();
        flower.bloom();
        flower.fragrance();
        flower.color();
        flower.petals();
        flower.pollination();
        System.out.println("**************************************");
        Flower flower1 = new Rose();
        flower1.bloom();
        flower1.fragrance();
        flower1.color();
        flower1.petals();
        flower1.pollination();

        System.out.println("**************************************");

        Rose rose = new Rose();
        rose.bloom();
        rose.fragrance();
        rose.color();
        rose.petals();
        rose.pollination();

        System.out.println("************Casting example**************");
        Lotus lotus=new Lotus();
        lotus.variety(flower);
        lotus.variety(flower1);
        lotus.variety(rose);

    }
}
