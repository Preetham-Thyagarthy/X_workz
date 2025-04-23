package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.drink.Drink;
import com.xworkz.inheritence.internal.drink.Juice;
import com.xworkz.inheritence.internal.drink.Refresh;

public class DrinkRunner {
    public static void main(String[] args) {

        Drink drink = new Drink();
        drink.sip();
        drink.refresh();
        drink.cold();
        drink.sweet();
        drink.healthy();
        System.out.println("**************************************");
        Drink drink1 = new Juice();
        drink1.sip();
        drink1.refresh();
        drink1.cold();
        drink1.sweet();
        drink1.healthy();

        System.out.println("**************************************");
        Juice juice=new Juice();
        juice.sip();
        juice.refresh();
        juice.cold();
        juice.sweet();
        juice.healthy();

        System.out.println("************Casting example**************");
        Refresh refresh=new Refresh();
        refresh.checkDrink(drink);
        refresh.checkDrink(drink1);
        refresh.checkDrink(juice);

    }
}
