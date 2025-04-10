package com.xworkz.gold;
import com.xworkz.gold.jewelry.Jewelry;

public class GoldRunner {
    public static void main(String[] args) {
        Jewelry jewelry = new Jewelry();
        jewelry.purity();
        jewelry.usage();
        jewelry.value();


        Gold gold = new Gold();
        gold.purity();
        gold.usage();
        gold.value();
    }
}
