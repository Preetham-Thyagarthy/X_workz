package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.color.Color;
import com.xworkz.inheritence.internal.color.Rainbow;
import com.xworkz.inheritence.internal.color.Red;

public class ColorRunner {
    public static void main(String[] args) {
        Color color = new Color();
        color.display();
        color.mix();
        color.brighten();
        color.fade();
        System.out.println("**************************************");
        Color color1 = new Red();
        color1.display();
        color1.mix();
        color1.brighten();
        color1.fade();

        System.out.println("**************************************");
        Red red = new Red();
        red.display();
        red.mix();
        red.brighten();
        red.fade();

        System.out.println("************Casting example**************");
        Rainbow rainbow=new Rainbow();
        rainbow.colorpalatte(color);
        rainbow.colorpalatte(color1);
        rainbow.colorpalatte(red);
    }
}
