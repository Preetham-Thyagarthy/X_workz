package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.utensil.Hammer;
import com.xworkz.inheritence.internal.utensil.Utensil;

public class UtensilRunner {
    public static void main(String[] args) {


        Utensil utensil =new Utensil();
        utensil.use();
        utensil.material();
        utensil.grip();
        utensil.durability();
        System.out.println("**************************************");
        Utensil utensil1 =new Hammer();
        utensil1.use();
        utensil1.material();
        utensil1.grip();
        utensil1.durability();

        System.out.println("**************************************");
        Hammer hammer = new Hammer();
        hammer.use();
        hammer.material();
        hammer.grip();
        hammer.durability();

        System.out.println("**************************************");
    }
}
