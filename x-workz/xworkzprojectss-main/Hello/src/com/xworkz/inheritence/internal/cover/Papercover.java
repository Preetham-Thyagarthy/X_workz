package com.xworkz.inheritence.internal.cover;

public class Papercover {
    public void wrapCover(Cover cover) {
        cover.protect();
        cover.design();
        cover.provideGrip();
        cover.waterproof();
        cover.enhanceLook();

        if (cover instanceof BookCover) {
            System.out.println("Cover is an instance of BookCover");
            BookCover bookCover = (BookCover) cover;
            bookCover.materials();
        }
    }
}
