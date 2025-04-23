package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.area.Area;
import com.xworkz.inheritence.internal.area.Bedroom;
import com.xworkz.inheritence.internal.area.Width;

public class AreaRunner {
    public static void main(String[] args) {

        Area areas = new Area();
        areas.enter();
        areas.decorate();
        areas.clean();
        areas.ventilate();

        System.out.println("**************************************");

        Area area = new Bedroom();
        area.enter();
        area.decorate();
        area.clean();
        area.ventilate();

        System.out.println("**************************************");
        Bedroom bedroom = new Bedroom();
        bedroom.enter();
        bedroom.decorate();
        bedroom.clean();
        bedroom.ventilate();

        System.out.println("*************Casting example***************");
        Width width=new Width();
        width.measure(areas);
        width.measure(area);
        width.measure(bedroom);

    }
}
