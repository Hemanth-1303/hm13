package com.xworkz.mobile;

import com.xworkz.mobile.smartphone.Smartphone;

public class MobileRunner {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.brand();
        smartphone.operatingSystem();
        smartphone.batteryLife();

        Mobile mobile = new Mobile();
        mobile.brand();
        mobile.operatingSystem();
        mobile.batteryLife();
    }
}
