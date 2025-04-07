package com.xworkz.mattressapp.mattress;

public class MattressRunner {

        public static void main(String[] args) {
            Mattress mattress1 = new Mattress();
            mattress1.setMaterial("Memory Foam");
            mattress1.setSize("Queen");
            mattress1.setThickness(10.0);
            mattress1.setBrand("Sleepwell");
            mattress1.setPrice(20000.0);
            mattress1.setIsFoldable(false);
            mattress1.setComfortLevel("Soft");

            System.out.println("Mattress Details:");
            System.out.println("Material: " + mattress1.getMaterial());
            System.out.println("Size: " + mattress1.getSize());
            System.out.println("Thickness: " + mattress1.getThickness() + " inches");
            System.out.println("Brand: " + mattress1.getBrand());
            System.out.println("Price: " + mattress1.getPrice());
            System.out.println("Is Foldable: " + mattress1.getIsFoldable());
            System.out.println("Comfort Level: " + mattress1.getComfortLevel());

            Mattress mattress2 = new Mattress();
            mattress2.setMaterial("Latex");
            mattress2.setSize("King");
            mattress2.setThickness(8.0);
            mattress2.setBrand("Kurlon");
            mattress2.setPrice(25000.0);
            mattress2.setIsFoldable(false);
            mattress2.setComfortLevel("Medium");

            System.out.println("\nMattress Details:");
            System.out.println("Material: " + mattress2.getMaterial());
            System.out.println("Size: " + mattress2.getSize());
            System.out.println("Thickness: " + mattress2.getThickness() + " inches");
            System.out.println("Brand: " + mattress2.getBrand());
            System.out.println("Price: " + mattress2.getPrice());
            System.out.println("Is Foldable: " + mattress2.getIsFoldable());
            System.out.println("Comfort Level: " + mattress2.getComfortLevel());

            Mattress mattress3 = new Mattress();
            mattress3.setMaterial("Spring");
            mattress3.setSize("Twin");
            mattress3.setThickness(7.0);
            mattress3.setBrand("Duroflex");
            mattress3.setPrice(18000.0);
            mattress3.setIsFoldable(true);
            mattress3.setComfortLevel("Firm");

            System.out.println("\nMattress Details:");
            System.out.println("Material: " + mattress3.getMaterial());
            System.out.println("Size: " + mattress3.getSize());
            System.out.println("Thickness: " + mattress3.getThickness() + " inches");
            System.out.println("Brand: " + mattress3.getBrand());
            System.out.println("Price: " + mattress3.getPrice());
            System.out.println("Is Foldable: " + mattress3.getIsFoldable());
            System.out.println("Comfort Level: " + mattress3.getComfortLevel());

            Mattress mattress4 = new Mattress();
            mattress4.setMaterial("Coir");
            mattress4.setSize("Full");
            mattress4.setThickness(6.0);
            mattress4.setBrand("Wakefit");
            mattress4.setPrice(12000.0);
            mattress4.setIsFoldable(true);
            mattress4.setComfortLevel("Medium");

            System.out.println("\nMattress Details:");
            System.out.println("Material: " + mattress4.getMaterial());
            System.out.println("Size: " + mattress4.getSize());
            System.out.println("Thickness: " + mattress4.getThickness() + " inches");
            System.out.println("Brand: " + mattress4.getBrand());
            System.out.println("Price: " + mattress4.getPrice());
            System.out.println("Is Foldable: " + mattress4.getIsFoldable());
            System.out.println("Comfort Level: " + mattress4.getComfortLevel());

            Mattress mattress5 = new Mattress();
            mattress5.setMaterial("Gel Foam");
            mattress5.setSize("California King");
            mattress5.setThickness(9.0);
            mattress5.setBrand("Peps");
            mattress5.setPrice(30000.0);
            mattress5.setIsFoldable(false);
            mattress5.setComfortLevel("Soft");

            System.out.println("\nMattress Details:");
            System.out.println("Material: " + mattress5.getMaterial());
            System.out.println("Size: " + mattress5.getSize());
            System.out.println("Thickness: " + mattress5.getThickness() + " inches");
            System.out.println("Brand: " + mattress5.getBrand());
            System.out.println("Price: " + mattress5.getPrice());
            System.out.println("Is Foldable: " + mattress5.getIsFoldable());
            System.out.println("Comfort Level: " + mattress5.getComfortLevel());
        }
    }

