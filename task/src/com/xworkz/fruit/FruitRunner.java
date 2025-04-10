package com.xworkz.fruit;

import com.xworkz.fruit.tropicalfruit.TropicalFruit;

public class FruitRunner {
    public static void main(String[] args) {
        TropicalFruit tropicalFruit = new TropicalFruit();
        tropicalFruit.name();
        tropicalFruit.type();
        tropicalFruit.origin();

        Fruit fruit = new Fruit();
        fruit.name();
        fruit.type();
        fruit.origin();
    }
}
