package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.lamp.Lamp;
import com.xworkz.inheritence.internal.lamp.Light;

public class LampRunner {
    public static void main(String[] args) {

        Lamp lamp = new Lamp();
        lamp.color();
        lamp.shape();
        lamp.size();
        lamp.appearance();
        lamp.use();
        System.out.println("**************************************");
        Lamp lamp1 = new Light();
        lamp1.color();
        lamp1.shape();
        lamp1.size();
        lamp1.appearance();
        lamp1.use();

        System.out.println("**************************************");
        Light light = new Light();
        light.color();
        light.shape();
        light.size();
        light.appearance();
        light.use();
    }
}
