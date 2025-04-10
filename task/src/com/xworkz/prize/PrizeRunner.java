package com.xworkz.prize;

import com.xworkz.prize.trophy.Trophy;

public class PrizeRunner {
    public static void main(String[] args) {
        Trophy trophy = new Trophy();
        trophy.type();
        trophy.purpose();
        trophy.value();

        Prize prize = new Prize();
        prize.type();
        prize.purpose();
        prize.value();
    }
}
