package com.xworkz.inheritence.internal.drink;

public class Refresh {
    public void checkDrink(Drink drink) {
        drink.sip();
        drink.refresh();
        drink.cold();
        drink.sweet();
        drink.healthy();

        if (drink instanceof Juice) {
            System.out.println("Drink is an instance of Juice");
            Juice juice = (Juice) drink;
            juice.taste();
        }
    }
}
