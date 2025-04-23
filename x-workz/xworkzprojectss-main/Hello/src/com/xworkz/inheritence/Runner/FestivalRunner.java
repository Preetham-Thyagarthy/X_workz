package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.festival.Diwali;
import com.xworkz.inheritence.internal.festival.Festival;
import com.xworkz.inheritence.internal.festival.Ugadi;

public class FestivalRunner {
    public static void main(String[] args) {

        Festival festival=new Festival();
        festival.celebrate();
        festival.traditions();
        festival.holidays();
        festival.food();
        System.out.println("**************************************");
        Festival festival1 =new Diwali();
        festival1.celebrate();
        festival1.traditions();
        festival1.holidays();
        festival1.food();

        System.out.println("**************************************");
        Diwali diwali = new Diwali();
        diwali.celebrate();
        diwali.traditions();
        diwali.holidays();
        diwali.food();

        System.out.println("************Casting example**************");
        Ugadi ugadi=new Ugadi();
        ugadi.celebration(festival);
        ugadi.celebration(festival1);
        ugadi.celebration(diwali);
    }
}
