package com.xworkz.inheritence.internal.furniture;

public class Table {
    public void designing(Furniture furniture) {
        furniture.support();
        furniture.material();
        furniture.weight();
        furniture.move();
        furniture.design();

        if (furniture instanceof Chair) {
            System.out.println("Furniture is an instance of Chair");
            Chair chair = (Chair) furniture;
            chair.shaping();
        }
    }
}
