package com.xworkz.inheritence.internal.couch;

public class KingSizeCouch extends Couch {
    public KingSizeCouch() {
        super();
        System.out.println("Running non-arg constructor KingSizeBed");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
    @Override
    public void fold() {
        System.out.println("Can be folded");
    }
    @Override
    public void comfort() {
        System.out.println("Provides comfort");
    }
    @Override
    public void decorate() {
        System.out.println("Couch is decorated");
    }
    @Override
    public void adjustHeight() {
        System.out.println("Have adjustable height");
    }
    public void hygine(){
        System.out.println("Hygine is maintained in the couch");
    }
}
