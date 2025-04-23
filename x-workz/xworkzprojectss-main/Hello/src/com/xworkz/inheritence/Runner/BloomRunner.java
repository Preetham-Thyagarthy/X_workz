package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.bloom.Bloom;
import com.xworkz.inheritence.internal.bloom.Flowers;
import com.xworkz.inheritence.internal.bloom.RedBloom;

public class BloomRunner {
    public static void main(String[] args) {

        Bloom bloom = new Bloom();
        bloom.hasFragrance();
        bloom.comesInDifferentColors();
        bloom.usedForDecoration();
        bloom.hasThorns();
        bloom.symbolizesLove();

        System.out.println("**************************************");

        Bloom blooms = new RedBloom();
        blooms.hasFragrance();
        blooms.comesInDifferentColors();
        blooms.usedForDecoration();
        blooms.hasThorns();
        blooms.symbolizesLove();

        System.out.println("**************************************");
        RedBloom redRose = new RedBloom();
        redRose.hasFragrance();
        redRose.comesInDifferentColors();
        redRose.usedForDecoration();
        redRose.hasThorns();
        redRose.symbolizesLove();

        System.out.println("************Casting example**************");
        Flowers flowers=new Flowers();
        flowers.process(bloom);
        flowers.process(blooms);
        flowers.process(redRose);
    }
}
