package com.xworkz.inheritence.internal.festival;

public class Ugadi {
    public void celebration(Festival festival) {
        festival.celebrate();
        festival.traditions();
        festival.holidays();
        festival.food();

        if (festival instanceof Diwali) {
            System.out.println("Festival is an instance of Diwali");
            Diwali diwali = (Diwali) festival;
            diwali.culture();
        }
    }
}
