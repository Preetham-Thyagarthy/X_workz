package com.xworkz.inheritence.internal.keyboard;

public class MechanicalKeyboard extends Keyboard {
    public MechanicalKeyboard() {
        super();
        System.out.println("Running non-arg constructor MechanicalKeyboard");
    }
    @Override
    public void type() {
        System.out.println("Typing");
    }
    @Override
    public void connect() {
        System.out.println("Connecting");
    }
    @Override
    public void pressKey() {
        System.out.println("Pressed");
    }
    @Override
    public void backlight() {
        System.out.println("Have backlight");
    }
}
