package com.xworkz.inheritence.internal.swim;

public class FreestyleSwim extends Swim {
    public FreestyleSwim() {
        super();
        System.out.println("Running non-arg constructor FreestyleSwim");
    }
    @Override
    public void improvesHealth() {
        System.out.println("Cardiovascular health");
    }
    @Override
    public void requiresWater() {
        System.out.println("Requires a pool, river, or sea");
    }
    @Override
    public void isFullBodyExercise() {
        System.out.println("Engages all muscle groups");
    }
    @Override
    public void isPopularSport() {
        System.out.println("An Olympic sport");
    }
    @Override
    public void hasDifferentStyles() {
        System.out.println("Has different styles");
    }
}
