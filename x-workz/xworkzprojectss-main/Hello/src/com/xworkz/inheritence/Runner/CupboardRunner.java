package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.cupboard.Cupboard;
import com.xworkz.inheritence.internal.cupboard.Door;
import com.xworkz.inheritence.internal.cupboard.Shelf;

public class CupboardRunner {
    public static void main(String[] args) {

        Cupboard cupboard =new Cupboard();
        cupboard.close();
        cupboard.key();
        cupboard.lock();
        cupboard.handle();
        cupboard.open();
        System.out.println("**************************************");
        Cupboard cupboard1 =new Door();
        cupboard1.close();
        cupboard1.key();
        cupboard1.lock();
        cupboard1.handle();
        cupboard1.open();

        System.out.println("**************************************");
        Door door=new Door();
        door.close();
        door.key();
        door.handle();
        door.open();
        door.lock();

        System.out.println("************Casting example**************");
        Shelf shelf=new Shelf();
        shelf.checkDoor(cupboard);
        shelf.checkDoor(cupboard1);
        shelf.checkDoor(door);
    }

}
