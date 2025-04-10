package com.xworkz.road;

import com.xworkz.road.highway.Highway;

public class RoadRunner {
    public static void main(String[] args) {
        Highway highway = new Highway();
        highway.type();
        highway.material();
        highway.usage();

        Road road = new Road();
        road.type();
        road.material();
        road.usage();
    }
}
