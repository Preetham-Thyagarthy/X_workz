package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.mountain.Mountain;
import com.xworkz.inheritence.internal.mountain.Everest;

public class MountainRunner {
    public static void main(String[] args) {


        Mountain mountain = new Mountain();
        mountain.height();
        mountain.climate();
        mountain.location();
        mountain.trekking();
        mountain.wildlife();

        System.out.println("**************************************");
        Mountain mount = new Everest();
        mount.height();
        mount.climate();
        mount.location();
        mount.trekking();
        mount.wildlife();



        System.out.println("**************************************");

        Everest everest = new Everest();
        everest.height();
        everest.climate();
        everest.location();
        everest.trekking();
        everest.wildlife();
    }
}
