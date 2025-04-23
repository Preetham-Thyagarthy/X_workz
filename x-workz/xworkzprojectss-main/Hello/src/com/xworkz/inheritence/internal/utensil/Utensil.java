package com.xworkz.inheritence.internal.utensil;

public class Utensil {
    public Utensil() {
        System.out.println("Running non-arg constructor of Utensil");
    }
    public void use() {
        System.out.println("Utensil is used for work");
    }
    public void material() {
        System.out.println("Utensil is made of metal or plastic");
    }
    public void grip() {
        System.out.println("Utensil has a grip");
    }
    public void durability() {
        System.out.println("Utensil should be durable");
    }
}
