package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.couch.Businesscouch;
import com.xworkz.inheritence.internal.couch.Couch;
import com.xworkz.inheritence.internal.couch.KingSizeCouch;

public class CouchRunner {
    public static void main(String[] args) {

        Couch couch = new Couch();
        couch.sleep();
        couch.fold();
        couch.comfort();
        couch.decorate();
        couch.adjustHeight();
        System.out.println("**************************************");
        Couch couch1 = new KingSizeCouch();
        couch1.sleep();
        couch1.fold();
        couch1.comfort();
        couch1.decorate();
        couch1.adjustHeight();

        System.out.println("**************************************");
        KingSizeCouch kingSizeBed = new KingSizeCouch();
        kingSizeBed.sleep();
        kingSizeBed.fold();
        kingSizeBed.comfort();
        kingSizeBed.decorate();
        kingSizeBed.adjustHeight();

        System.out.println("************Casting example**************");
        Businesscouch businesscouch=new Businesscouch();
        businesscouch.arrange(couch);
        businesscouch.arrange(couch1);
        businesscouch.arrange(kingSizeBed);
    }
}
