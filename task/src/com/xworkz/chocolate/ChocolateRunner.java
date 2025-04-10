package com.xworkz.chocolate;

import com.xworkz.chocolate.darkchocolate.DarkChocolate;

public class ChocolateRunner {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate();
        chocolate.type();
        chocolate.ingredients();
        chocolate.origin();

        DarkChocolate darkChocolate = new DarkChocolate();
        darkChocolate.type();
        darkChocolate.ingredients();
        darkChocolate.origin();
    }
}
