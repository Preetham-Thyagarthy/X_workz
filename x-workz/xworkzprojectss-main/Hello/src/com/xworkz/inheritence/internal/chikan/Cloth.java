package com.xworkz.inheritence.internal.chikan;

public class Cloth {
    public void applyEmbroidery(Chikan chikan) {
        chikan.traditionalArt();
        chikan.handcrafted();
        chikan.originatedInLucknow();
        chikan.delicateDesigns();
        chikan.usedOnFabrics();

        if (chikan instanceof ChikanEmbroidery) {
            System.out.println("Chikan is an instance of ChikanEmbroidery");
            ChikanEmbroidery embroidery = (ChikanEmbroidery) chikan;
            embroidery.embroiderywork();
        }
    }
}
