package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.formal.Cottonformal;
import com.xworkz.inheritence.internal.formal.Formal;
import com.xworkz.inheritence.internal.formal.SilkFormal;

public class FormalRunner {
    public static void main(String[] args) {


        Formal formal = new Formal();
        formal.traditionalWear();
        formal.comfortable();
        formal.wornOnFestivals();
        formal.comesInVariousDesigns();
        formal.pairedWithPajama();
        System.out.println("**************************************");
        Formal formal1 = new SilkFormal();
        formal1.traditionalWear();
        formal1.comfortable();
        formal1.wornOnFestivals();
        formal1.comesInVariousDesigns();
        formal1.pairedWithPajama();

        System.out.println("**************************************");
        SilkFormal silkKurta = new SilkFormal();
        silkKurta.traditionalWear();
        silkKurta.comfortable();
        silkKurta.wornOnFestivals();
        silkKurta.comesInVariousDesigns();
        silkKurta.pairedWithPajama();

        System.out.println("************Casting example**************");
        Cottonformal cottonformal=new Cottonformal();
        cottonformal.dressing(formal);
        cottonformal.dressing(formal1);
        cottonformal.dressing(silkKurta);
    }
}
