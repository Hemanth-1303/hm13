package com.xworkz.watertankapp.watertank;

public class WaterTankRunner {
        public static void main(String[] args) {
            WaterTank tank1 = new WaterTank();
            tank1.setMaterial("Plastic");
            tank1.setCapacityInLiters(1000.0);
            tank1.setColor("Blue");
            tank1.setBrand("Sintex");
            tank1.setIsInsulated(true);
            tank1.setPrice(5500.0);
            tank1.setShape("Cylindrical");

            System.out.println("WaterTank Details:");
            System.out.println("The tank material is " + tank1.getMaterial());
            System.out.println("The tank capacity is " + tank1.getCapacityInLiters() + " liters");
            System.out.println("The tank color is " + tank1.getColor());
            System.out.println("The tank brand is " + tank1.getBrand());
            System.out.println("The tank is insulated: " + tank1.getIsInsulated());
            System.out.println("The tank price is " + tank1.getPrice());
            System.out.println("The tank shape is " + tank1.getShape());

            WaterTank tank2 = new WaterTank();
            tank2.setMaterial("Steel");
            tank2.setCapacityInLiters(2000.0);
            tank2.setColor("Silver");
            tank2.setBrand("Tata");
            tank2.setIsInsulated(true);
            tank2.setPrice(15000.0);
            tank2.setShape("Rectangular");

            System.out.println("\nWaterTank Details:");
            System.out.println("The tank material is " + tank2.getMaterial());
            System.out.println("The tank capacity is " + tank2.getCapacityInLiters() + " liters");
            System.out.println("The tank color is " + tank2.getColor());
            System.out.println("The tank brand is " + tank2.getBrand());
            System.out.println("The tank is insulated: " + tank2.getIsInsulated());
            System.out.println("The tank price is " + tank2.getPrice());
            System.out.println("The tank shape is " + tank2.getShape());

            WaterTank tank3 = new WaterTank();
            tank3.setMaterial("Fiber");
            tank3.setCapacityInLiters(500.0);
            tank3.setColor("White");
            tank3.setBrand("Supreme");
            tank3.setIsInsulated(false);
            tank3.setPrice(3000.0);
            tank3.setShape("Spherical");

            System.out.println("\nWaterTank Details:");
            System.out.println("The tank material is " + tank3.getMaterial());
            System.out.println("The tank capacity is " + tank3.getCapacityInLiters() + " liters");
            System.out.println("The tank color is " + tank3.getColor());
            System.out.println("The tank brand is " + tank3.getBrand());
            System.out.println("The tank is insulated: " + tank3.getIsInsulated());
            System.out.println("The tank price is " + tank3.getPrice());
            System.out.println("The tank shape is " + tank3.getShape());

            WaterTank tank4 = new WaterTank();
            tank4.setMaterial("Concrete");
            tank4.setCapacityInLiters(5000.0);
            tank4.setColor("Gray");
            tank4.setBrand("UltraTech");
            tank4.setIsInsulated(false);
            tank4.setPrice(20000.0);
            tank4.setShape("Cubical");

            System.out.println("\nWaterTank Details:");
            System.out.println("The tank material is " + tank4.getMaterial());
            System.out.println("The tank capacity is " + tank4.getCapacityInLiters() + " liters");
            System.out.println("The tank color is " + tank4.getColor());
            System.out.println("The tank brand is " + tank4.getBrand());
            System.out.println("The tank is insulated: " + tank4.getIsInsulated());
            System.out.println("The tank price is " + tank4.getPrice());
            System.out.println("The tank shape is " + tank4.getShape());

            WaterTank tank5 = new WaterTank();
            tank5.setMaterial("PVC");
            tank5.setCapacityInLiters(750.0);
            tank5.setColor("Black");
            tank5.setBrand("Ashirvad");
            tank5.setIsInsulated(true);
            tank5.setPrice(4500.0);
            tank5.setShape("Cylindrical");

            System.out.println("\nWaterTank Details:");
            System.out.println("The tank material is " + tank5.getMaterial());
            System.out.println("The tank capacity is " + tank5.getCapacityInLiters() + " liters");
            System.out.println("The tank color is " + tank5.getColor());
            System.out.println("The tank brand is " + tank5.getBrand());
            System.out.println("The tank is insulated: " + tank5.getIsInsulated());
            System.out.println("The tank price is " + tank5.getPrice());
            System.out.println("The tank shape is " + tank5.getShape());
        }
    }


