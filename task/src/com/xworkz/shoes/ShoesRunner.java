package com.xworkz.shoes;
import com.xworkz.shoes.sportshoes.SportShoes;

public class ShoesRunner {
    public static void main(String[] args) {
        SportShoes sportsShoes = new SportShoes();
        sportsShoes.brand();
        sportsShoes.type();
        sportsShoes.durability();

        Shoes shoes = new Shoes();
        shoes.brand();
        shoes.type();
        shoes.durability();
    }
}
