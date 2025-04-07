package com.xworkz.cookerapp.cooker;

public class CookerRunner {
        public static void main(String[] args) {
            Cooker cooker1 = new Cooker();
            cooker1.setBrand("Prestige");
            cooker1.setCapacity(5);
            cooker1.setMaterial("Stainless Steel");
            cooker1.setIsElectric(false);
            cooker1.setWarrantyPeriod(2);
            cooker1.setPrice(2500.0);
            cooker1.setType("Pressure Cooker");

            System.out.println("Cooker Details:");
            System.out.println("Brand: " + cooker1.getBrand());
            System.out.println("Capacity: " + cooker1.getCapacity() + " liters");
            System.out.println("Material: " + cooker1.getMaterial());
            System.out.println("Is Electric: " + cooker1.getIsElectric());
            System.out.println("Warranty Period: " + cooker1.getWarrantyPeriod() + " years");
            System.out.println("Price: ₹" + cooker1.getPrice());
            System.out.println("Type: " + cooker1.getType());

            Cooker cooker2 = new Cooker();
            cooker2.setBrand("Hawkins");
            cooker2.setCapacity(3);
            cooker2.setMaterial("Aluminum");
            cooker2.setIsElectric(false);
            cooker2.setWarrantyPeriod(5);
            cooker2.setPrice(1800.0);
            cooker2.setType("Pressure Cooker");

            System.out.println("Cooker Details:");
            System.out.println("Brand: " + cooker2.getBrand());
            System.out.println("Capacity: " + cooker2.getCapacity() + " liters");
            System.out.println("Material: " + cooker2.getMaterial());
            System.out.println("Is Electric: " + cooker2.getIsElectric());
            System.out.println("Warranty Period: " + cooker2.getWarrantyPeriod() + " years");
            System.out.println("Price: ₹" + cooker2.getPrice());
            System.out.println("Type: " + cooker2.getType());

            Cooker cooker3 = new Cooker();
            cooker3.setBrand("Bajaj");
            cooker3.setCapacity(4);
            cooker3.setMaterial("Hard Anodized");
            cooker3.setIsElectric(true);
            cooker3.setWarrantyPeriod(3);
            cooker3.setPrice(3500.0);
            cooker3.setType("Electric Rice Cooker");

            System.out.println("Cooker Details:");
            System.out.println("Brand: " + cooker3.getBrand());
            System.out.println("Capacity: " + cooker3.getCapacity() + " liters");
            System.out.println("Material: " + cooker3.getMaterial());
            System.out.println("Is Electric: " + cooker3.getIsElectric());
            System.out.println("Warranty Period: " + cooker3.getWarrantyPeriod() + " years");
            System.out.println("Price: ₹" + cooker3.getPrice());
            System.out.println("Type: " + cooker3.getType());

            Cooker cooker4 = new Cooker();
            cooker4.setBrand("Philips");
            cooker4.setCapacity(6);
            cooker4.setMaterial("Stainless Steel");
            cooker4.setIsElectric(true);
            cooker4.setWarrantyPeriod(4);
            cooker4.setPrice(4000.0);
            cooker4.setType("Multi-Cooker");

            System.out.println("Cooker Details:");
            System.out.println("Brand: " + cooker4.getBrand());
            System.out.println("Capacity: " + cooker4.getCapacity() + " liters");
            System.out.println("Material: " + cooker4.getMaterial());
            System.out.println("Is Electric: " + cooker4.getIsElectric());
            System.out.println("Warranty Period: " + cooker4.getWarrantyPeriod() + " years");
            System.out.println("Price: ₹" + cooker4.getPrice());
            System.out.println("Type: " + cooker4.getType());

            Cooker cooker5 = new Cooker();
            cooker5.setBrand("Panasonic");
            cooker5.setCapacity(8);
            cooker5.setMaterial("Aluminum");
            cooker5.setIsElectric(true);
            cooker5.setWarrantyPeriod(3);
            cooker5.setPrice(5000.0);
            cooker5.setType("Electric Pressure Cooker");

            System.out.println("Cooker Details:");
            System.out.println("Brand: " + cooker5.getBrand());
            System.out.println("Capacity: " + cooker5.getCapacity() + " liters");
            System.out.println("Material: " + cooker5.getMaterial());
            System.out.println("Is Electric: " + cooker5.getIsElectric());
            System.out.println("Warranty Period: " + cooker5.getWarrantyPeriod() + " years");
            System.out.println("Price: ₹" + cooker5.getPrice());
            System.out.println("Type: " + cooker5.getType());
        }
    }

