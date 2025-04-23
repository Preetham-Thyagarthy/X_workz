package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.meal.Burger;
import com.xworkz.inheritence.internal.meal.Meal;

public class MealRunner {
    public static void main(String[] args) {

        Burger bug=new Burger();
        bug.eat();
        bug.taste();
        bug.cook();
        bug.healthy();
        bug.spicy();
        System.out.println("**************************************");
        Burger bug21 =new Burger();
        bug21.eat();
        bug21.taste();
        bug21.cook();
        bug21.healthy();
        bug21.spicy();

        System.out.println("**************************************");

        Meal meal =new Meal();
        meal.eat();
        meal.taste();
        meal.cook();
        meal.healthy();
        meal.spicy();

    }
}
