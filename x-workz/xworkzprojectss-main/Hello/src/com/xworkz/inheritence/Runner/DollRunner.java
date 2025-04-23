package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.doll.Doll;
import com.xworkz.inheritence.internal.doll.BarbieDoll;
import com.xworkz.inheritence.internal.doll.Doremon;

public class DollRunner {
    public static void main(String[] args) {

        Doll doll = new Doll();
        doll.play();
        doll.dressUp();
        doll.talk();
        doll.move();
        doll.collect();
        System.out.println("**************************************");
        Doll doll1 = new BarbieDoll();
        doll1.play();
        doll1.dressUp();
        doll1.talk();
        doll1.move();
        doll1.collect();

        System.out.println("**************************************");
        BarbieDoll barbieDoll = new BarbieDoll();
        barbieDoll.play();
        barbieDoll.dressUp();
        barbieDoll.talk();
        barbieDoll.move();
        barbieDoll.collect();

        System.out.println("************Casting example**************");
        Doremon doremon=new Doremon();
        doremon.dollbox(doll);
        doremon.dollbox(doll1);
        doremon.dollbox(barbieDoll);
    }
}
