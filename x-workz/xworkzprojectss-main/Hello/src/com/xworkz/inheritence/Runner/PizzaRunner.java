package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.pizza.Pizza;
import com.xworkz.inheritence.internal.pizza.CheesePizza;

public class PizzaRunner {
    public static void main(String[] args) {



        Pizza pizza = new Pizza();
        pizza.hasCrust();
        pizza.toppedWithSauce();
        pizza.includesCheese();
        pizza.availableInDifferentFlavors();
        pizza.cookedInOven();
        System.out.println("**************************************");
        Pizza pizzas = new CheesePizza();
        pizzas.hasCrust();
        pizzas.toppedWithSauce();
        pizzas.includesCheese();
        pizzas.availableInDifferentFlavors();
        pizzas.cookedInOven();

        System.out.println("-----------------");
        CheesePizza cheesePizza = new CheesePizza();
        cheesePizza.hasCrust();
        cheesePizza.toppedWithSauce();
        cheesePizza.includesCheese();
        cheesePizza.availableInDifferentFlavors();
        cheesePizza.cookedInOven();
    }
}
