package com.xworkz.country;

import com.xworkz.country.india.India;

public class CountryRunner {
    public static void main(String[] args) {
        India india = new India();
        india.name();
        india.population();
        india.currency();

        Country country = new Country();
        country.name();
        country.population();
        country.currency();
    }
}
