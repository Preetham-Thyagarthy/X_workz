package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.chikan.Chikan;
import com.xworkz.inheritence.internal.chikan.ChikanEmbroidery;
import com.xworkz.inheritence.internal.chikan.Cloth;

public class ChikanRunner {
    public static void main(String[] args) {

        Chikan chikan = new Chikan();
        chikan.traditionalArt();
        chikan.handcrafted();
        chikan.originatedInLucknow();
        chikan.delicateDesigns();
        chikan.usedOnFabrics();
        System.out.println("**************************************");
        Chikan chikan1 = new ChikanEmbroidery();
        chikan1.traditionalArt();
        chikan1.handcrafted();
        chikan1.originatedInLucknow();
        chikan1.delicateDesigns();
        chikan1.usedOnFabrics();

        System.out.println("**************************************");
        ChikanEmbroidery chikanEmbroidery = new ChikanEmbroidery();
        chikanEmbroidery.traditionalArt();
        chikanEmbroidery.handcrafted();
        chikanEmbroidery.originatedInLucknow();
        chikanEmbroidery.delicateDesigns();
        chikanEmbroidery.usedOnFabrics();

        System.out.println("************Casting example**************");
        Cloth cloth=new Cloth();
        cloth.applyEmbroidery(chikan);
        cloth.applyEmbroidery(chikan1);
        cloth.applyEmbroidery(chikanEmbroidery);


    }
}
