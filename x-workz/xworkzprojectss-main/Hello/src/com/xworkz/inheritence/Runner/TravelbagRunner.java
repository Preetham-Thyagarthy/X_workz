package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.travelbag.Travelbag;
import com.xworkz.inheritence.internal.travelbag.Zip;

public class TravelbagRunner {
    public static void main(String[] args) {


        Travelbag travelbag =new Travelbag();
        travelbag.close();
        travelbag.color();
        travelbag.noOfZip();
        travelbag.open();
        travelbag.small();
        System.out.println("**************************************");
        Travelbag travelbag1 =new Zip();
        travelbag1.close();
        travelbag1.color();
        travelbag1.noOfZip();
        travelbag1.open();
        travelbag1.small();

        System.out.println("**************************************");
        Zip zip=new Zip();
        zip.close();
        zip.color();
        zip.noOfZip();
        zip.open();
        zip.small();

        System.out.println("**************************************");


    }
}
