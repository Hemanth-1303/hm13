package com.xworkz.zoo;

import com.xworkz.zoo.safarizoo.SafariZoo;

public class ZooRunner {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.animals();
        zoo.location();
        zoo.facilities();

        SafariZoo safariZoo = new SafariZoo();
        safariZoo.animals();
        safariZoo.location();
        safariZoo.facilities();
    }
}
