package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.keyboard.Keyboard;
import com.xworkz.inheritence.internal.keyboard.MechanicalKeyboard;

public class KeyboardRunner {
    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard();
        keyboard.type();
        keyboard.connect();
        keyboard.pressKey();
        keyboard.backlight();
        System.out.println("**************************************");
        Keyboard keyboards = new MechanicalKeyboard();
        keyboards.type();
        keyboards.connect();
        keyboards.pressKey();
        keyboards.backlight();

        System.out.println("**************************************");
        MechanicalKeyboard mechanicalKeyboard = new MechanicalKeyboard();
        mechanicalKeyboard.type();
        mechanicalKeyboard.connect();
        mechanicalKeyboard.pressKey();
        mechanicalKeyboard.backlight();
    }
}
