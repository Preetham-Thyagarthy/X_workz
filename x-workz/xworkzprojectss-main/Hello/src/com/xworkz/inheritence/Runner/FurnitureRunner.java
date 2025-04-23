package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.furniture.Furniture;
import com.xworkz.inheritence.internal.furniture.Chair;
import com.xworkz.inheritence.internal.furniture.Table;

public class FurnitureRunner {
    public static void main(String[] args) {


        Furniture furniture = new Furniture();
        furniture.support();
        furniture.material();
        furniture.weight();
        furniture.move();
        furniture.design();
        System.out.println("**************************************");
        Furniture furniture1 = new Chair();
        furniture1.support();
        furniture1.material();
        furniture1.weight();
        furniture1.move();
        furniture1.design();

        System.out.println("**************************************");

        Chair chair = new Chair();
        chair.support();
        chair.material();
        chair.weight();
        chair.move();
        chair.design();

        System.out.println("************Casting example**************");
        Table table=new Table();
        table.designing(furniture);
        table.designing(furniture1);
        table.designing(chair);

    }
}
