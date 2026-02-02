package com.rimonmostafiz.design.creational;

import java.util.ArrayList;
import java.util.List;

interface Item {
    String name();

    Packing packing();

    float price();
}

interface Packing {
    String pack();
}

/**
 * Created by Rimon Mostafiz on 3/29/2016.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItem();
        System.out.println("Total Cost : " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegMeal.showItem();
        System.out.println("Total Cost : " + nonVegMeal.getCost());
    }
}

class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}

class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}

abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}

abstract class ColdDrinks implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}

class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}

class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }

}

class Coke extends ColdDrinks {
    @Override
    public float price() {
        return 10.5f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}

class Pepsi extends ColdDrinks {
    @Override
    public float price() {
        return 12.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}

class Meal {
    List<Item> list = new ArrayList<Item>();

    public void addItem(Item item) {
        list.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item i : list) {
            cost += i.price();
        }

        return cost;
    }

    void showItem() {
        for (Item i : list) {
            System.out.print("Item : " + i.name());
            System.out.print(" , Price : " + i.price());
            System.out.println(" , packing : " + i.packing().pack());
        }
    }
}

class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
