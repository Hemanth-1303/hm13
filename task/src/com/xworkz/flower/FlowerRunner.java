package com.xworkz.flower;

import com.xworkz.flower.lotus.Lotus;

public class FlowerRunner {
    public static void main(String args[]){
        Flower flower = new Flower();
        flower.color();
        flower.habitat();

        Lotus lotus = new Lotus();
        lotus.color();
        lotus.habitat();
    }
}
