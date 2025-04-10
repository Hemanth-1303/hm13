package com.xworkz.watch;

import com.xworkz.watch.smartwatch.SmartWatch;

public class WatchRunner {
    public static void main(String[] args) {
        SmartWatch smartWatch = new SmartWatch();
        smartWatch.brand();
        smartWatch.type();
        smartWatch.waterResistant();


        Watch watch = new Watch();
        watch.brand();
        watch.type();
        watch.waterResistant();
    }
}
