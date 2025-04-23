package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.stationery.Pen;
import com.xworkz.inheritence.internal.stationery.Stationery;

public class StationeryRunner {
    public static void main(String[] args) {


        Stationery stationery=new Stationery();
        stationery.write();
        stationery.erase();
        stationery.color();
        stationery.size();
        System.out.println("**************************************");
        Stationery stationery1 =new Pen();
        stationery1.write();
        stationery1.erase();
        stationery1.color();
        stationery1.size();

        System.out.println("**************************************");
        Pen pen = new Pen();
        pen.write();
        pen.erase();
        pen.color();
        pen.size();

        System.out.println("**************************************");
    }
}
