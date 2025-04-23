package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.pup.Pup;
import com.xworkz.inheritence.internal.pup.LabradorPup;

public class PupRunner {
    public static void main(String[] args) {


        Pup pup = new Pup();
        pup.playful();
        pup.requiresTraining();
        pup.needsCare();
        pup.communicatesWithBarks();
        pup.lovesToCuddle();
        System.out.println("**************************************");
        Pup pupps = new LabradorPup();
        pupps.playful();
        pupps.requiresTraining();
        pupps.needsCare();
        pupps.communicatesWithBarks();
        pupps.lovesToCuddle();

        System.out.println("-----------------");
        LabradorPup labradorPuppy = new LabradorPup();
        labradorPuppy.playful();
        labradorPuppy.requiresTraining();
        labradorPuppy.needsCare();
        labradorPuppy.communicatesWithBarks();
        labradorPuppy.lovesToCuddle();
    }
}
