package com.xworkz.shirtapp.shirt;

public class ShirtRunner {

        public static void main(String[] args) {
            Shirt shirt1 = new Shirt();
            shirt1.setSize("M");
            shirt1.setColor("Blue");
            shirt1.setFabric("Cotton");
            shirt1.setBrand("Levis");
            shirt1.setPrice(999.0);
            shirt1.setSleeveType("Full Sleeve");
            shirt1.setIsFormal(true);

            System.out.println("Shirt Details:");
            System.out.println("The shirt size is " + shirt1.getSize());
            System.out.println("The shirt color is " + shirt1.getColor());
            System.out.println("The shirt fabric is " + shirt1.getFabric());
            System.out.println("The shirt brand is " + shirt1.getBrand());
            System.out.println("The shirt price is " + shirt1.getPrice());
            System.out.println("The shirt sleeve type is " + shirt1.getSleeveType());
            System.out.println("The shirt is formal " + shirt1.getIsFormal());

            Shirt shirt2 = new Shirt();
            shirt2.setSize("L");
            shirt2.setColor("White");
            shirt2.setFabric("Polyester");
            shirt2.setBrand("Raymond");
            shirt2.setPrice(1299.0);
            shirt2.setSleeveType("Half Sleeve");
            shirt2.setIsFormal(true);

            System.out.println("Shirt Details:");
            System.out.println("The shirt size is " + shirt2.getSize());
            System.out.println("The shirt color is " + shirt2.getColor());
            System.out.println("The shirt fabric is " + shirt2.getFabric());
            System.out.println("The shirt brand is " + shirt2.getBrand());
            System.out.println("The shirt price is " + shirt2.getPrice());
            System.out.println("The shirt sleeve type is " + shirt2.getSleeveType());
            System.out.println("The shirt is formal " + shirt2.getIsFormal());

            Shirt shirt3 = new Shirt();
            shirt3.setSize("XL");
            shirt3.setColor("Black");
            shirt3.setFabric("Linen");
            shirt3.setBrand("Peter England");
            shirt3.setPrice(1499.0);
            shirt3.setSleeveType("Full Sleeve");
            shirt3.setIsFormal(false);

            System.out.println("Shirt Details:");
            System.out.println("The shirt size is " + shirt3.getSize());
            System.out.println("The shirt color is " + shirt3.getColor());
            System.out.println("The shirt fabric is " + shirt3.getFabric());
            System.out.println("The shirt brand is " + shirt3.getBrand());
            System.out.println("The shirt price is " + shirt3.getPrice());
            System.out.println("The shirt sleeve type is " + shirt3.getSleeveType());
            System.out.println("The shirt is formal " + shirt3.getIsFormal());

            Shirt shirt4 = new Shirt();
            shirt4.setSize("S");
            shirt4.setColor("Red");
            shirt4.setFabric("Silk");
            shirt4.setBrand("Van Heusen");
            shirt4.setPrice(1999.0);
            shirt4.setSleeveType("Half Sleeve");
            shirt4.setIsFormal(true);

            System.out.println("Shirt Details:");
            System.out.println("The shirt size is " + shirt4.getSize());
            System.out.println("The shirt color is " + shirt4.getColor());
            System.out.println("The shirt fabric is " + shirt4.getFabric());
            System.out.println("The shirt brand is " + shirt4.getBrand());
            System.out.println("The shirt price is " + shirt4.getPrice());
            System.out.println("The shirt sleeve type is " + shirt4.getSleeveType());
            System.out.println("The shirt is formal " + shirt4.getIsFormal());

            Shirt shirt5 = new Shirt();
            shirt5.setSize("M");
            shirt5.setColor("Green");
            shirt5.setFabric("Denim");
            shirt5.setBrand("Wrangler");
            shirt5.setPrice(1099.0);
            shirt5.setSleeveType("Full Sleeve");
            shirt5.setIsFormal(false);

            System.out.println("Shirt Details:");
            System.out.println("The shirt size is " + shirt5.getSize());
            System.out.println("The shirt color is " + shirt5.getColor());
            System.out.println("The shirt fabric is " + shirt5.getFabric());
            System.out.println("The shirt brand is " + shirt5.getBrand());
            System.out.println("The shirt price is " + shirt5.getPrice());
            System.out.println("The shirt sleeve type is " + shirt5.getSleeveType());
            System.out.println("The shirt is formal " + shirt5.getIsFormal());
        }
    }
