package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.earpods.Blootooth;
import com.xworkz.inheritence.internal.earpods.Earpods;
import com.xworkz.inheritence.internal.earpods.WirelessEarpods;

public class EarpodsRunner {
    public static void main(String[] args) {


        Earpods earpods = new Earpods();
        earpods.playMusic();
        earpods.charge();
        earpods.connect();
        System.out.println("**************************************");
        Earpods earpods1 = new WirelessEarpods();
        earpods1.playMusic();
        earpods1.charge();
        earpods1.connect();

        System.out.println("**************************************");
        WirelessEarpods wirelessEarpods = new WirelessEarpods();
        wirelessEarpods.playMusic();
        wirelessEarpods.charge();
        wirelessEarpods.connect();

        System.out.println("************Casting example**************");
        Blootooth blootooth=new Blootooth();
        blootooth.test(earpods);
        blootooth.test(earpods1);
        blootooth.test(wirelessEarpods);
    }
}
