package com.xworkz.inheritence.internal.church;

public class Protestedchurch {
    public void blessing(Church church) {
        church.attendService();
        church.pray();
        church.lightCandles();
        church.singHymns();
        church.readBible();

        if (church instanceof CatholicChurch) {
            System.out.println("Church is an instance of CatholicChurch");
            CatholicChurch catholic = (CatholicChurch) church;
            catholic.fast();
        }
    }
}
