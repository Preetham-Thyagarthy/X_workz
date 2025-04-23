package com.xworkz.inheritence.internal.color;

public class Rainbow {
    public void colorpalatte(Color color) {
        color.display();
        color.mix();
        color.brighten();
        color.fade();

        if (color instanceof Red) {
            System.out.println("Color is an instance of Red");
            Red red = (Red) color;
            red.shape();
        }
    }
}
