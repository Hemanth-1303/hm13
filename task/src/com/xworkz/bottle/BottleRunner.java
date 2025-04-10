package com.xworkz.bottle;

import com.xworkz.bottle.waterbottle.WaterBottle;

public class BottleRunner {
    public static void main(String[] args) {
        WaterBottle waterBottle = new WaterBottle();
        waterBottle.material();
        waterBottle.capacity();
        waterBottle.usage();


        Bottle bottle = new Bottle();
        bottle.material();
        bottle.capacity();
        bottle.usage();
    }
}
