package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.circlet.Circlet;
import com.xworkz.inheritence.internal.circlet.Jewelary;
import com.xworkz.inheritence.internal.circlet.Type;

public class CircletRunner {
    public static void main(String[] args) {

        Circlet circlet =new Circlet();
        circlet.size();
        circlet.color();
        circlet.shape();
        circlet.matel();
        circlet.quality();
        System.out.println("**************************************");
        Circlet circlet1 =new Type();
        circlet1.size();
        circlet1.color();
        circlet1.shape();
        circlet1.matel();
        circlet1.quality();

        System.out.println("**************************************");
        Type type = new Type();
        type.size();
        type.color();
        type.shape();
        type.matel();
        type.quality();

        System.out.println("************Casting example**************");
        Jewelary jewelary=new Jewelary();
        jewelary.checkCirclet(circlet);
        jewelary.checkCirclet(circlet1);
        jewelary.checkCirclet(type);
    }
    }

