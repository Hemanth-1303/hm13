package com.xworkz.majigeapp.majige;

public class MajigeRunner {

        public static void main(String[] args) {
            Majige majige1 = new Majige();
            majige1.setBrand("Nandini");
            majige1.setQuantityInLiters(0.5);
            majige1.setPrice(20.0);
            majige1.setIsSweetened(false);
            majige1.setFlavor("Classic");
            majige1.setOrigin("Karnataka");
            majige1.setPackagingType("Plastic Bottle");

            System.out.println("Majige Details:");
            System.out.println("The brand is " + majige1.getBrand());
            System.out.println("The quantity is " + majige1.getQuantityInLiters() + " liters");
            System.out.println("The price is " + majige1.getPrice());
            System.out.println("Is it sweetened: " + majige1.getIsSweetened());
            System.out.println("The flavor is " + majige1.getFlavor());
            System.out.println("The origin is " + majige1.getOrigin());
            System.out.println("The packaging type is " + majige1.getPackagingType());

            Majige majige2 = new Majige();
            majige2.setBrand("Amul");
            majige2.setQuantityInLiters(1.0);
            majige2.setPrice(40.0);
            majige2.setIsSweetened(true);
            majige2.setFlavor("Mango");
            majige2.setOrigin("Gujarat");
            majige2.setPackagingType("Tetra Pack");

            System.out.println("\nMajige Details:");
            System.out.println("The brand is " + majige2.getBrand());
            System.out.println("The quantity is " + majige2.getQuantityInLiters() + " liters");
            System.out.println("The price is " + majige2.getPrice());
            System.out.println("Is it sweetened: " + majige2.getIsSweetened());
            System.out.println("The flavor is " + majige2.getFlavor());
            System.out.println("The origin is " + majige2.getOrigin());
            System.out.println("The packaging type is " + majige2.getPackagingType());

            Majige majige3 = new Majige();
            majige3.setBrand("Heritage");
            majige3.setQuantityInLiters(0.25);
            majige3.setPrice(15.0);
            majige3.setIsSweetened(false);
            majige3.setFlavor("Buttermilk");
            majige3.setOrigin("Telangana");
            majige3.setPackagingType("Glass Bottle");

            System.out.println("\nMajige Details:");
            System.out.println("The brand is " + majige3.getBrand());
            System.out.println("The quantity is " + majige3.getQuantityInLiters() + " liters");
            System.out.println("The price is " + majige3.getPrice());
            System.out.println("Is it sweetened: " + majige3.getIsSweetened());
            System.out.println("The flavor is " + majige3.getFlavor());
            System.out.println("The origin is " + majige3.getOrigin());
            System.out.println("The packaging type is " + majige3.getPackagingType());

            Majige majige4 = new Majige();
            majige4.setBrand("Arokya");
            majige4.setQuantityInLiters(0.75);
            majige4.setPrice(25.0);
            majige4.setIsSweetened(true);
            majige4.setFlavor("Spiced");
            majige4.setOrigin("Tamil Nadu");
            majige4.setPackagingType("Pouch");

            System.out.println("\nMajige Details:");
            System.out.println("The brand is " + majige4.getBrand());
            System.out.println("The quantity is " + majige4.getQuantityInLiters() + " liters");
            System.out.println("The price is " + majige4.getPrice());
            System.out.println("Is it sweetened: " + majige4.getIsSweetened());
            System.out.println("The flavor is " + majige4.getFlavor());
            System.out.println("The origin is " + majige4.getOrigin());
            System.out.println("The packaging type is " + majige4.getPackagingType());

            Majige majige5 = new Majige();
            majige5.setBrand("Thirumala");
            majige5.setQuantityInLiters(1.5);
            majige5.setPrice(60.0);
            majige5.setIsSweetened(false);
            majige5.setFlavor("Ginger");
            majige5.setOrigin("Andhra Pradesh");
            majige5.setPackagingType("Plastic Can");

            System.out.println("\nMajige Details:");
            System.out.println("The brand is " + majige5.getBrand());
            System.out.println("The quantity is " + majige5.getQuantityInLiters() + " liters");
            System.out.println("The price is " + majige5.getPrice());
            System.out.println("Is it sweetened: " + majige5.getIsSweetened());
            System.out.println("The flavor is " + majige5.getFlavor());
            System.out.println("The origin is " + majige5.getOrigin());
            System.out.println("The packaging type is " + majige5.getPackagingType());
        }
    }
