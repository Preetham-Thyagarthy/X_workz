package com.xworkz.inheritence.internal.formal;

public class Cottonformal {
    public void dressing(Formal formal) {
        formal.traditionalWear();
        formal.comfortable();
        formal.wornOnFestivals();
        formal.comesInVariousDesigns();
        formal.pairedWithPajama();

        if (formal instanceof SilkFormal) {
            System.out.println("This is an instance of SilkFormal");
            SilkFormal silk = (SilkFormal) formal;
            silk.materials();
        }
    }
}
