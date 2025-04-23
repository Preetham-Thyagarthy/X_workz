package com.xworkz.inheritence.internal.chikan;

public class ChikanEmbroidery extends Chikan {
    public ChikanEmbroidery() {
        super();
        System.out.println("Running non-arg constructor ChikanEmbroidery");
    }
    @Override
    public void traditionalArt() {
        System.out.println("Traditional Indian craft");
    }
    @Override
    public void handcrafted() {
        System.out.println("Mostly handcrafted");
    }
    @Override
    public void originatedInLucknow() {
        System.out.println("Originated in Lucknow, India");
    }
    @Override
    public void delicateDesigns() {
        System.out.println("Have delicate and intricate patterns");
    }
    @Override
    public void usedOnFabrics() {
        System.out.println("Used on fabrics like cotton, silk, and muslin");
    }
    public void embroiderywork(){
        System.out.println("Embroidery work");
    }
}
