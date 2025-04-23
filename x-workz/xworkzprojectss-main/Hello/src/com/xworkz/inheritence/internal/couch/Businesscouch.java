package com.xworkz.inheritence.internal.couch;

public class Businesscouch {
    public void arrange(Couch couch) {
        couch.sleep();
        couch.fold();
        couch.comfort();
        couch.decorate();
        couch.adjustHeight();

        if (couch instanceof KingSizeCouch) {
            System.out.println("Couch is an instance of KingSizeCouch");
            KingSizeCouch kingCouch = (KingSizeCouch) couch;
            kingCouch.hygine();
        }
    }
}
