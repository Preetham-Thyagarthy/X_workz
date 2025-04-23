package com.xworkz.inheritence.internal.dress;

public class Weddingdress {
    public void dressstore(Dress dress) {
        dress.wear();
        dress.comesInDifferentStyles();
        dress.availableForAllGenders();
        dress.providesComfort();
        dress.madeOfVariousMaterials();

        if (dress instanceof PartyDress) {
            System.out.println("Dress is an instance of PartyDress");
            PartyDress partyDress = (PartyDress) dress;
            partyDress.colorofsuites();
        }
    }
}
