package com.xworkz.inheritence.internal.armlet;

public class Chain  {
        public void wrap(Armlet armlet) {
            armlet.wornOnWrist();
            armlet.madeOfDifferentMaterials();
            armlet.traditionalJewelry();
            armlet.availableInVariousDesigns();
            armlet.symbolizeMaritalStatus();

            if (armlet instanceof GoldArmlet) {
                System.out.println("Armlet is an instance of GoldArmlet");
                GoldArmlet goldarmlet = (GoldArmlet) armlet;
                goldarmlet.shine();
            }
        }
    }



