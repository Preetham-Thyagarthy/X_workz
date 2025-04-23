package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.dress.Dress;
import com.xworkz.inheritence.internal.dress.PartyDress;
import com.xworkz.inheritence.internal.dress.Weddingdress;

public class DressRunner {
    public static void main(String[] args) {

        Dress dress = new Dress();
        dress.wear();
        dress.comesInDifferentStyles();
        dress.availableForAllGenders();
        dress.providesComfort();
        dress.madeOfVariousMaterials();
        System.out.println("**************************************");
        Dress dresses = new PartyDress();
        dresses.wear();
        dresses.comesInDifferentStyles();
        dresses.availableForAllGenders();
        dresses.providesComfort();
        dresses.madeOfVariousMaterials();

        System.out.println("**************************************");
        PartyDress partyDress = new PartyDress();
        partyDress.wear();
        partyDress.comesInDifferentStyles();
        partyDress.availableForAllGenders();
        partyDress.providesComfort();
        partyDress.madeOfVariousMaterials();

        System.out.println("************Casting example**************");
        Weddingdress weddingdress=new Weddingdress();
        weddingdress.dressstore(dress);
        weddingdress.dressstore(dresses);
        weddingdress.dressstore(partyDress);
    }
}
