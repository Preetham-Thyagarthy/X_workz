package com.xworkz.inheritence.internal.area;

public class Width {
    public void measure(Area area){
        area.enter();
        area.decorate();
        area.ventilate();
        area.ventilate();

        if(area instanceof Bedroom){
            System.out.println("Area instance of bedroom");
            Bedroom bedroom=(Bedroom) area;
            bedroom.design();
        }
    }
}
