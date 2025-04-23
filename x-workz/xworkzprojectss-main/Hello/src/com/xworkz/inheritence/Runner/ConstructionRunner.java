package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.construction.Building;
import com.xworkz.inheritence.internal.construction.Construction;
import com.xworkz.inheritence.internal.construction.House;

public class ConstructionRunner {
    public static void main(String[] args) {

        Construction construction =new Construction();
        construction.shelter();
        construction.structure();
        construction.floors();
        construction.foundation();
        System.out.println("**************************************");
        Construction construction1 =new House();
        construction1.shelter();
        construction1.structure();
        construction1.floors();
        construction1.foundation();

        System.out.println("**************************************");
        House house = new House();
        house.shelter();
        house.structure();
        house.floors();
        house.foundation();

        System.out.println("************Casting example**************");
        Building building=new Building();
        building.builder(construction);
        building.builder(construction1);
        building.builder(house);
    }
}
