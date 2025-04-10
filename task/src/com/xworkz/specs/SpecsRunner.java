package com.xworkz.specs;

import com.xworkz.specs.sunglasses.Sunglasses;

public class SpecsRunner {
    public static void main(String[] args) {
        Sunglasses sunglasses = new Sunglasses();
        sunglasses.brand();
        sunglasses.type();
        sunglasses.frameMaterial();

        Specs specs = new Specs();
        specs.brand();
        specs.type();
        specs.frameMaterial();
    }
}
