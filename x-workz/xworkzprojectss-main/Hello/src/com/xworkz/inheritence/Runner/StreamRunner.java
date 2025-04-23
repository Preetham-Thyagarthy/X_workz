package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.stream.Stream;
import com.xworkz.inheritence.internal.stream.Nile;

public class StreamRunner {
    public static void main(String[] args) {


        Stream stream = new Stream();
        stream.length();
        stream.origin();
        stream.flows();
        stream.providesWater();
        stream.wildlife();
        System.out.println("**************************************");
        Stream stream1 = new Nile();
        stream1.length();
        stream1.origin();
        stream1.flows();
        stream1.providesWater();
        stream1.wildlife();

        System.out.println("**************************************");

        Nile nile = new Nile();
        nile.length();
        nile.origin();
        nile.flows();
        nile.providesWater();
        nile.wildlife();

        System.out.println("**************************************");
    }
}
