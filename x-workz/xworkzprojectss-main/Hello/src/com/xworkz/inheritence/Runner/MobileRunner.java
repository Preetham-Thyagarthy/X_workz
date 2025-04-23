package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.mobile.Mobile;
import com.xworkz.inheritence.internal.mobile.Smartphone;

public class MobileRunner {
    public static void main(String[] args) {


        Mobile mobile = new Mobile();
        mobile.call();
        mobile.message();
        mobile.camera();
        mobile.battery();
        mobile.internet();

        System.out.println("**************************************");
        Mobile mob = new Smartphone();
        mob.call();
        mob.message();
        mob.camera();
        mob.battery();
        mob.internet();



        System.out.println("**************************************");
        Smartphone smartphone=new Smartphone();
        smartphone.call();
        smartphone.message();
        smartphone.camera();
        smartphone.battery();
        smartphone.internet();

    }
}
