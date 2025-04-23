package com.xworkz.inheritence.internal.flask;

public class Cap extends Flask {
    public Cap(){
        super();
        System.out.println("running non-arg const cap");
    }
    @Override
    public void fill(){
        System.out.println("filled");
    }
    @Override
    public void water(){
        System.out.println("water it");
    }
    @Override
    public void milk(){
        System.out.println("milk it");
    }
    @Override
    public void glass(){
        System.out.println("glass it");
    }
    @Override
    public void frozen(){
        System.out.println("frozen bottle");
    }
    public void shape(){
        System.out.println("The cap will be of circular");
    }
}
