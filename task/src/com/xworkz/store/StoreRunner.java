package com.xworkz.store;

import com.xworkz.store.supermarket.SuperMarket;

public class StoreRunner {
    public static void main(String[] args) {
        Store store = new Store();
        store.products();
        store.location();
        store.services();

        SuperMarket supermarket = new SuperMarket();
        supermarket.products();
        supermarket.location();
        supermarket.services();
    }
}
