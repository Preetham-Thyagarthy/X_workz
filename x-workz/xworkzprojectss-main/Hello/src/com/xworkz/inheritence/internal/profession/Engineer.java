package com.xworkz.inheritence.internal.profession;

public class Engineer extends Profession {
    public Engineer() {
        super();
        System.out.println("Running non-arg constructor of Engineer");
    }
    @Override
    public void work() {
        System.out.println("Involves work");
    }
    @Override
    public void salary() {
        System.out.println("Provides a salary");
    }
    @Override
    public void skills() {
        System.out.println("Requires skills");
    }
    @Override
    public void education() {
        System.out.println("Requires education");
    }
}
