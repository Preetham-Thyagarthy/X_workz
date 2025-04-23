package com.xworkz.inheritence.internal.profession;

public class Profession {
    public Profession() {
        System.out.println("Running non-arg constructor of Profession");
    }
    public void work() {
        System.out.println("Profession involves work");
    }
    public void salary() {
        System.out.println("Profession provides a salary");
    }
    public void skills() {
        System.out.println("Profession requires skills");
    }
    public void education() {
        System.out.println("Profession requires education");
    }
}
