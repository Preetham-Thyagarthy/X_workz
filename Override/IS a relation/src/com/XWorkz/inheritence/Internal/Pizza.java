package com.XWorkz.inheritence.Internal;

public class Pizza extends Food{
    public Pizza()
    {
        super();
        System.out.println("No args Pizza Constructor");
    }
    @Override
    public void items()
    {
        System.out.println("Food Items");
    }
    @Override
    public void teast()
    {
        System.out.println("Food Teast");
    }
    @Override
    public void price()
    {
        System.out.println("Food Price");
    }
    @Override
    public void name()
    {
        System.out.println("Food Name");
    }
    @Override
    public void type()
    {
        System.out.println("Type of Food");
    }
}
