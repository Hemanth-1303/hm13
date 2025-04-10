package com.xworkz.food;

import com.xworkz.food.fastfood.FastFood;

public class FoodRunner {
    public static void main(String[] args) {
        FastFood fastFood = new FastFood();
        fastFood.name();
        fastFood.type();
        fastFood.cuisine();

        Food food = new Food();
        food.name();
        food.type();
        food.cuisine();
    }
}
