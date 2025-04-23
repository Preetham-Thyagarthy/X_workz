package com.xworkz.inheritence.internal.bloom;

public class RedBloom extends Bloom {
    public RedBloom() {
        super();
        System.out.println("Running non-arg constructor RedRose");
    }
    @Override
    public void hasFragrance() {
        System.out.println("Pleasant fragrance");
    }
    @Override
    public void comesInDifferentColors() {
        System.out.println("Colors like red, pink, and white");
    }
    @Override
    public void usedForDecoration() {
        System.out.println("Used for decoration and gifting");
    }
    @Override
    public void hasThorns() {
        System.out.println("Have thorns on their stems");
    }
    @Override
    public void symbolizesLove() {
        System.out.println("Symbol of love and affection");
    }

    public  void leaf(){
        System.out.println("Leaf of the rose plant");
    }
}
