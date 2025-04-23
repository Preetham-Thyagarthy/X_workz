package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.phuchka.Phuchka;
import com.xworkz.inheritence.internal.phuchka.SpicyPhuchka;

public class PhuchkaRunner {
    public static void main(String[] args) {


        Phuchka phuchka = new Phuchka();
        phuchka.popularStreetFood();
        phuchka.madeOfCrispyPuri();
        phuchka.comesWithVariety();
        phuchka.servedWithFilling();
        phuchka.bestEatenFresh();

        System.out.println("**************************************");
        Phuchka phuchkas = new SpicyPhuchka();
        phuchkas.popularStreetFood();
        phuchkas.madeOfCrispyPuri();
        phuchkas.comesWithVariety();
        phuchkas.servedWithFilling();
        phuchkas.bestEatenFresh();

        System.out.println("-----------------");
        SpicyPhuchka spicyPanipuri = new SpicyPhuchka();
        spicyPanipuri.popularStreetFood();
        spicyPanipuri.madeOfCrispyPuri();
        spicyPanipuri.comesWithVariety();
        spicyPanipuri.servedWithFilling();
        spicyPanipuri.bestEatenFresh();
    }
}
