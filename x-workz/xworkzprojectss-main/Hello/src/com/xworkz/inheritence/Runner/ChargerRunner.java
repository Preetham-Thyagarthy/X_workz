package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.charger.Charger;
import com.xworkz.inheritence.internal.charger.Point;
import com.xworkz.inheritence.internal.charger.Wire;

public class ChargerRunner {
    public static void main(String[] args) {

        Charger charger=new Charger();
        charger.cPin();
        charger.phone();
        charger.plug();
        charger.small();
        charger.white();
        System.out.println("**************************************");
        Charger charger1 =new Wire();
        charger1.cPin();
        charger1.phone();
        charger1.plug();
        charger1.small();
        charger1.white();

        System.out.println("**************************************");
        Wire wire=new Wire();
        wire.cPin();
        wire.plug();
        wire.phone();
        wire.small();
        wire.white();

        System.out.println("************Casting example**************");
        Point point=new Point();
        point.switchs(charger);
        point.switchs(charger1);
        point.switchs(wire);
    }

}
