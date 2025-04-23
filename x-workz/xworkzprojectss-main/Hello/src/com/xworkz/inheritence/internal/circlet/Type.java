package com.xworkz.inheritence.internal.circlet;

public class Type extends Circlet {
    public Type(){
        super();
        System.out.println("running non-arg const Braclet");
    }
    @Override
    public void size(){
        System.out.println("Size of circlet");
    }
    @Override
    public void color(){
        System.out.println("Color of Circlet");
    }
    @Override
    public void shape(){
        System.out.println(" shape of Circlet");
    }
    @Override
    public void matel(){
        System.out.println(" metal of Circlet");
    }
    @Override
    public void quality(){
        System.out.println(" quality of Circlet");
    }
    public void material(){
        System.out.println("Material is good");
    }
}
