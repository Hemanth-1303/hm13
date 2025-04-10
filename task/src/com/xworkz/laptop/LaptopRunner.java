package com.xworkz.laptop;

import com.xworkz.laptop.gaminglaptop.GamingLaptop;

public class LaptopRunner {
    public static void main(String[] args) {
        GamingLaptop gamingLaptop = new GamingLaptop();
        gamingLaptop.brand();
        gamingLaptop.processor();
        gamingLaptop.memory();

        Laptop laptop = new Laptop();
        laptop.brand();
        laptop.processor();
        laptop.memory();
    }
}
