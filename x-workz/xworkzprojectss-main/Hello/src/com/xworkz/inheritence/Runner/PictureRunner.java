package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.picture.Picture;
import com.xworkz.inheritence.internal.picture.DigitalPicture;

public class PictureRunner {
    public static void main(String[] args) {



        Picture picture = new Picture();
        picture.capture();
        picture.storeMemory();
        picture.printedOnPaper();
        picture.availableInDigitalFormat();
        picture.sharedOnSocialMedia();
        System.out.println("**************************************");
        Picture pictures = new DigitalPicture();
        pictures.capture();
        pictures.storeMemory();
        pictures.printedOnPaper();
        pictures.availableInDigitalFormat();
        pictures.sharedOnSocialMedia();

        System.out.println("-----------------");
        DigitalPicture digitalPhoto = new DigitalPicture();
        digitalPhoto.capture();
        digitalPhoto.storeMemory();
        digitalPhoto.printedOnPaper();
        digitalPhoto.availableInDigitalFormat();
        digitalPhoto.sharedOnSocialMedia();
    }
}
