package com.xworkz.coconut;

import com.xworkz.coconut.drycoconut.DryCoconut;

public class CoconutRunner {
    public static void main(String[] args) {
        Coconut coconut = new Coconut();
        coconut.type();
        coconut.usage();
        coconut.regions();

        DryCoconut dryCoconut = new DryCoconut();
        dryCoconut.type();
        dryCoconut.usage();
        dryCoconut.regions();
    }
}
