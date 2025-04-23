package com.xworkz.inheritence.internal.hair;

public class CurlyHair extends Hair {
    public CurlyHair() {
        super();
        System.out.println("Running non-arg constructor CurlyHair");
    }
    @Override
    public void providesProtection() {
        System.out.println("Protection to the scalp from the sun and cold");
    }
    @Override
    public void growsNaturally() {
        System.out.println("Naturally from the scalp");
    }
    @Override
    public void canBeStyled() {
        System.out.println("Styled in different ways");
    }
    @Override
    public void requiresMaintenance() {
        System.out.println("Regular maintenance and care");
    }
    @Override
    public void madeOfKeratin() {
        System.out.println("Made of keratin protein");
    }
    public void conditioner(){
        System.out.println("Using conditioner hairs will become straight");
    }
}
