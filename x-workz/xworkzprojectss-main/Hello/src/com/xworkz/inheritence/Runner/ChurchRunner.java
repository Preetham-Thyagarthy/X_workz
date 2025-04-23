package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.church.Church;
import com.xworkz.inheritence.internal.church.CatholicChurch;
import com.xworkz.inheritence.internal.church.Protestedchurch;

public class ChurchRunner {
    public static void main(String[] args) {
        Church church = new Church();
        church.attendService();
        church.pray();
        church.lightCandles();
        church.singHymns();
        church.readBible();
        System.out.println("**************************************");
        Church church1 = new CatholicChurch();
        church1.attendService();
        church1.pray();
        church1.lightCandles();
        church1.singHymns();
        church1.readBible();

        System.out.println("**************************************");
        CatholicChurch catholicChurch = new CatholicChurch();
        catholicChurch.attendService();
        catholicChurch.pray();
        catholicChurch.lightCandles();
        catholicChurch.singHymns();
        catholicChurch.readBible();

        System.out.println("************Casting example**************");
        Protestedchurch protestedchurch=new Protestedchurch();
        protestedchurch.blessing(church);
        protestedchurch.blessing(church1);
        protestedchurch.blessing(catholicChurch);
    }
}
