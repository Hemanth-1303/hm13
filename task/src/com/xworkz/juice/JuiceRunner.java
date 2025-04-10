package com.xworkz.juice;

import com.xworkz.juice.freshjuice.FreshJuice;

public class JuiceRunner {
    public static void main(String[] args) {
        FreshJuice freshJuice = new FreshJuice();
        freshJuice.flavor();
        freshJuice.type();
        freshJuice.shelfLife();

        Juice juice = new Juice();
        juice.flavor();
        juice.type();
        juice.shelfLife();
    }
}
