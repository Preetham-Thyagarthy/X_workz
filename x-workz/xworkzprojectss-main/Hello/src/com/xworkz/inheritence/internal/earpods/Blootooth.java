package com.xworkz.inheritence.internal.earpods;

public class Blootooth {
    public void test(Earpods earpods) {
        earpods.playMusic();
        earpods.charge();
        earpods.connect();

        if (earpods instanceof WirelessEarpods) {
            System.out.println("Earpods is an instance of WirelessEarpods");
            WirelessEarpods wirelessEarpods = (WirelessEarpods) earpods;
            wirelessEarpods.wireless();
        }
    }
}
