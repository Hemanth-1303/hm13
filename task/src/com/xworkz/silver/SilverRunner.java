package com.xworkz.silver;

import com.xworkz.silver.jewelrysilver.JewelrySilver;

public class SilverRunner {
    public static void main(String[] args) {
        JewelrySilver jewelrySilver = new JewelrySilver();
        jewelrySilver.type();
        jewelrySilver.usage();
        jewelrySilver.properties();

        Silver silver = new Silver();
        silver.type();
        silver.usage();
        silver.properties();
    }
}
