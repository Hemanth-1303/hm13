package com.xworkz.furniture;

import com.xworkz.furniture.chair.Chair;

public class FurnitureRunner {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.material();
        chair.purpose();
        chair.durability();

        Furniture furniture = new Furniture();
        furniture.material();
        furniture.purpose();
        furniture.durability();
    }
}
