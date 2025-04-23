package com.xworkz.inheritence.internal.goa;

public class SouthGoa {
    public void nature(Goa goa) {
        goa.visitBeach();
        goa.enjoyNightlife();
        goa.exploreForts();
        goa.tasteSeafood();
        goa.relax();

        if (goa instanceof NorthGoa) {
            System.out.println("This is an instance of NorthGoa.");
            NorthGoa northGoa = (NorthGoa) goa;
            northGoa.temples();
        }
    }
}
