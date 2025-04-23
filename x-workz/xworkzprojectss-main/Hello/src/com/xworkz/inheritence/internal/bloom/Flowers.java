package com.xworkz.inheritence.internal.bloom;

public class Flowers {
    public void process(Bloom bloom) {
        bloom.hasFragrance();
        bloom.comesInDifferentColors();
        bloom.usedForDecoration();
        bloom.hasThorns();
        bloom.symbolizesLove();

        if (bloom instanceof RedBloom) {
            System.out.println("Bloom is an instance of RedBloom");
            RedBloom redBloom = (RedBloom) bloom;
            redBloom.leaf();
        }
    }
}
