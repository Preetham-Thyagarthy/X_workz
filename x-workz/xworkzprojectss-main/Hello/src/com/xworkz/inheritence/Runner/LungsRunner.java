package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.lungs.Lungs;
import com.xworkz.inheritence.internal.lungs.HealthyLungs;

public class LungsRunner {
    public static void main(String[] args) {


        Lungs lungs = new Lungs();
        lungs.pumpsBlood();
        lungs.beatsContinuously();
        lungs.suppliesOxygen();
        lungs.removesWaste();
        lungs.worksInCirculatorySystem();

        System.out.println("**************************************");
        Lungs lung = new HealthyLungs();
        lung.pumpsBlood();
        lung.beatsContinuously();
        lung.suppliesOxygen();
        lung.removesWaste();
        lung.worksInCirculatorySystem();



        System.out.println("**************************************");
        HealthyLungs healthyHeart = new HealthyLungs();
        healthyHeart.pumpsBlood();
        healthyHeart.beatsContinuously();
        healthyHeart.suppliesOxygen();
        healthyHeart.removesWaste();
        healthyHeart.worksInCirculatorySystem();
    }
}
