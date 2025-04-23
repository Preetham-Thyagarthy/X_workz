package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.goa.Goa;
import com.xworkz.inheritence.internal.goa.NorthGoa;
import com.xworkz.inheritence.internal.goa.SouthGoa;

public class GoaRunner {
    public static void main(String[] args) {

        Goa goa = new Goa();
        goa.visitBeach();
        goa.enjoyNightlife();
        goa.exploreForts();
        goa.tasteSeafood();
        goa.relax();
        System.out.println("**************************************");
        Goa goan = new NorthGoa();
        goan.visitBeach();
        goan.enjoyNightlife();
        goan.exploreForts();
        goan.tasteSeafood();
        goan.relax();

        System.out.println("**************************************");
        NorthGoa northGoa = new NorthGoa();
        northGoa.visitBeach();
        northGoa.enjoyNightlife();
        northGoa.exploreForts();
        northGoa.tasteSeafood();
        northGoa.relax();

        System.out.println("************Casting example**************");
        SouthGoa southGoa=new SouthGoa();
        southGoa.nature(goa);
        southGoa.nature(goan);
        southGoa.nature(northGoa);
    }
}
