package com.xworkz.inheritence.internal.skill;

public class Java extends Skill {
    public Java() {
        super();
        System.out.println("Running non-arg constructor Java");
    }
    @Override
    public void speak() {
        System.out.println("Spoken");
    }
    @Override
    public void write() {
        System.out.println("Written");
    }
    @Override
    public void communicate() {
        System.out.println("Used for communication");
    }
    @Override
    public void grammar() {
        System.out.println("Grammar rules");
    }
    @Override
    public void origin() {
        System.out.println("Has an origin");
    }
}
