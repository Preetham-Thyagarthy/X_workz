package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.sugar.Sugar;
import com.xworkz.inheritence.internal.sugar.BrownSugar;

public class SugarRunner {
    public static void main(String[] args) {


        Sugar sugar = new Sugar();
        sugar.sweeten();
        sugar.dissolve();
        sugar.store();
        sugar.addToDesserts();
        sugar.usedInBaking();
        System.out.println("**************************************");
        Sugar sugar1 = new BrownSugar();
        sugar1.sweeten();
        sugar1.dissolve();
        sugar1.store();
        sugar1.addToDesserts();
        sugar1.usedInBaking();

        System.out.println("**************************************");
        BrownSugar brownSugar = new BrownSugar();
        brownSugar.sweeten();
        brownSugar.dissolve();
        brownSugar.store();
        brownSugar.addToDesserts();
        brownSugar.usedInBaking();

        System.out.println("**************************************");
    }
}
