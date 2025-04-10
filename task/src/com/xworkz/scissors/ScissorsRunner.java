package com.xworkz.scissors;

import com.xworkz.scissors.craftscissors.CraftScissors;

public class ScissorsRunner {
    public static void main(String[] args) {
        CraftScissors craftScissors = new CraftScissors();
        craftScissors.type();
        craftScissors.usage();
        craftScissors.material();

        Scissors scissors = new Scissors();
        scissors.type();
        scissors.usage();
        scissors.material();
    }
}
