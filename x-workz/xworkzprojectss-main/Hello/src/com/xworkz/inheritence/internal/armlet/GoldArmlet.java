package com.xworkz.inheritence.internal.armlet;

public class GoldArmlet extends Armlet {
    public GoldArmlet() {
        super();
        System.out.println("Running non-arg constructor GoldBangles");
    }
    @Override
    public void wornOnWrist() {
        System.out.println("Armlet are worn");
    }
    @Override
    public void madeOfDifferentMaterials() {
        System.out.println("Made of glass,metal");
    }
    @Override
    public void traditionalJewelry() {
        System.out.println("Armlet are jewelerys");
    }
    @Override
    public void availableInVariousDesigns() {
        System.out.println("Various designs and patterns");
    }
    @Override
    public void symbolizeMaritalStatus() {
        System.out.println("Armlet symbolize marital status");
    }
    public void shine() {
        System.out.println("Gold Armlet shines brightly");
    }
}
