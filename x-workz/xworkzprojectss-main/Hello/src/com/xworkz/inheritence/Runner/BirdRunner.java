package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.bird.Bird;
import com.xworkz.inheritence.internal.bird.Eagle;
import com.xworkz.inheritence.internal.bird.Flying;

public class BirdRunner {
    public static void main(String[] args) {

        Bird birds = new Bird();
        birds.fly();
        birds.feathers();
        birds.laysEggs();
        birds.sound();
        birds.vision();
        System.out.println("**************************************");

        Bird bird = new Eagle();
        bird.fly();
        bird.feathers();
        bird.laysEggs();
        bird.sound();
        bird.vision();

        System.out.println("**************************************");

        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.feathers();
        eagle.laysEggs();
        eagle.sound();
        eagle.vision();

        System.out.println("************Casting example**************");
        Flying flying=new Flying();
        flying.sanction(birds);
        flying.sanction(bird);
        flying.sanction(eagle);
    }
}
