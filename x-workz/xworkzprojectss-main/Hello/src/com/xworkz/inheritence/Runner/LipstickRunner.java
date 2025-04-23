package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.Lipstick.Lipstick;
import com.xworkz.inheritence.internal.Lipstick.Makeup;

public class LipstickRunner {
    public static void main(String[] args) {

        Lipstick lipstick=new Lipstick();
        lipstick.apply();
        lipstick.use();
        lipstick.sale();
        lipstick.remove();
        lipstick.refill();


        System.out.println("**************************************");
        Lipstick lips =new Makeup();
        lips.apply();
        lips.use();
        lips.sale();
        lips.remove();
        lips.refill();



        System.out.println("**************************************");

        Makeup makeup=new Makeup();
        makeup.apply();
        makeup.use();
        makeup.sale();
        makeup.remove();
        makeup.refill();
    }
}
