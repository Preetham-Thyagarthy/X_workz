package com.xworkz.inheritence.internal.cupboard;

public class Shelf {
    public void checkDoor(Cupboard cupboard) {
        cupboard.lock();
        cupboard.key();
        cupboard.handle();
        cupboard.open();
        cupboard.close();

        if (cupboard instanceof Door) {
            System.out.println("Cupboard is an instance of Door");
            Door door = (Door) cupboard;
            door.color();
        }
    }
}
