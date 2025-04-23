package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.worship.Worship;
import com.xworkz.inheritence.internal.worship.HinduWorship;

public class WorshipRunner {
    public static void main(String[] args) {

        Worship worship = new Worship();
        worship.worship();
        worship.meditate();
        worship.lightLamp();
        worship.offerPrayers();
        worship.ringBell();
        System.out.println("**************************************");
        Worship worship1 = new HinduWorship();
        worship1.worship();
        worship1.meditate();
        worship1.lightLamp();
        worship1.offerPrayers();
        worship1.ringBell();

        System.out.println("**************************************");
        HinduWorship hinduTemple = new HinduWorship();
        hinduTemple.worship();
        hinduTemple.meditate();
        hinduTemple.lightLamp();
        hinduTemple.offerPrayers();
        hinduTemple.ringBell();


    }
}
