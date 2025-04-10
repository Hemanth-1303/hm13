package com.xworkz.park;

import com.xworkz.park.nationalpark.NationalPark;

public class ParkRunner {
    public static void main(String[] args) {
        Park park = new Park();
        park.activities();
        park.location();
        park.facilities();

        NationalPark nationalPark = new NationalPark();
        nationalPark.activities();
        nationalPark.location();
        nationalPark.facilities();
    }
}
