package com.xworkz.liquor;

import com.xworkz.liquor.whiskey.Whiskey;

public class LiquorRunner {
    public static void main(String[] args) {
        Whiskey whiskey = new Whiskey();
        whiskey.type();
        whiskey.alcoholContent();
        whiskey.usage();

        Liquor liquor = new Liquor();
        liquor.type();
        liquor.alcoholContent();
        liquor.usage();
    }
}
