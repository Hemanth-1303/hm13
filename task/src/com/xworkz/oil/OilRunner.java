package com.xworkz.oil;

import com.xworkz.oil.essentialoil.EssentialOil;

public class OilRunner {
    public static void main(String[] args) {
        EssentialOil essentialOil = new EssentialOil();
        essentialOil.type();
        essentialOil.usage();
        essentialOil.source();

        Oil oil = new Oil();
        oil.type();
        oil.usage();
        oil.source();
    }
}
