package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.chapple.Chapple;
import com.xworkz.inheritence.internal.chapple.FlipFlop;
import com.xworkz.inheritence.internal.chapple.Foot;

public class ChappleRunner {
    public static void main(String[] args) {

        Chapple chapple = new Chapple();
        chapple.wear();
        chapple.walk();
        chapple.grip();
        chapple.comfort();

        System.out.println("**************************************");
        Chapple chapple1 = new FlipFlop();
        chapple1.wear();
        chapple1.walk();
        chapple1.grip();
        chapple1.comfort();

        System.out.println("**************************************");
        FlipFlop flipFlop = new FlipFlop();
        flipFlop.wear();
        flipFlop.walk();
        flipFlop.grip();
        flipFlop.comfort();

        System.out.println("************Casting example**************");
        Foot foot=new Foot();
        foot.wearing(chapple);
        foot.wearing(chapple1);
        foot.wearing(flipFlop);
    }
}
