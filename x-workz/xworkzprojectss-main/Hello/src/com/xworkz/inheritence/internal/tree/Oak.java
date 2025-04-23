package com.xworkz.inheritence.internal.tree;

public class Oak extends Tree {
    public Oak() {
        super();
        System.out.println("Running non-arg constructor Oak");
    }
    @Override
    public void roots() {
        System.out.println("Deep roots");
    }
    @Override
    public void branches() {
        System.out.println("Many branches");
    }
    @Override
    public void leaves() {
        System.out.println("Has leaves");
    }
    @Override
    public void oxygen() {
        System.out.println("Produces oxygen");
    }
    @Override
    public void lifespan() {
        System.out.println("Long lifespan");
    }
}
