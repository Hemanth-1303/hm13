package com.xworkz.vegetables;
import com.xworkz.vegetables.leafyvegetables.LeafyVegetables;

public class VegetablesRunner {
    public static void main(String[] args) {
        LeafyVegetables leafyVegetable = new LeafyVegetables();
        leafyVegetable.name();
        leafyVegetable.color();
        leafyVegetable.nutrientContent();

        Vegetables vegetable = new Vegetables();
        vegetable.name();
        vegetable.color();
        vegetable.nutrientContent();
    }
}
