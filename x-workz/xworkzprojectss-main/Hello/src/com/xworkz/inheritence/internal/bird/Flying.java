package com.xworkz.inheritence.internal.bird;

public class Flying {
    public void sanction(Bird bird) {
        bird.fly();
        bird.feathers();
        bird.laysEggs();
        bird.sound();
        bird.vision();

        if (bird instanceof Eagle) {
            System.out.println("Bird is an instance of Eagle");
            Eagle eagle = (Eagle) bird;
            eagle.neck();
        }
    }
}
