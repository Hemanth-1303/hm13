package com.xworkz.geyserapp.geyser;

public class GeyserRunner {
        public static void main(String[] args) {
            Geyser geyser1 = new Geyser();
            geyser1.setBrand("Havells");
            geyser1.setCapacity(25);
            geyser1.setType("Electric");
            geyser1.setPowerRating(2000);
            geyser1.setColor("White");
            geyser1.setPrice(8999.0);
            geyser1.setIsEnergyEfficient(true);

            System.out.println("Geyser Details:");
            System.out.println("Brand: " + geyser1.getBrand());
            System.out.println("Capacity: " + geyser1.getCapacity() + " liters");
            System.out.println("Type: " + geyser1.getType());
            System.out.println("Power Rating: " + geyser1.getPowerRating() + " watts");
            System.out.println("Color: " + geyser1.getColor());
            System.out.println("Price: ₹" + geyser1.getPrice());
            System.out.println("Is Energy Efficient: " + geyser1.getIsEnergyEfficient());

            Geyser geyser2 = new Geyser();
            geyser2.setBrand("Bajaj");
            geyser2.setCapacity(15);
            geyser2.setType("Gas");
            geyser2.setPowerRating(1500);
            geyser2.setColor("Silver");
            geyser2.setPrice(6999.0);
            geyser2.setIsEnergyEfficient(false);

            System.out.println("Geyser Details:");
            System.out.println("Brand: " + geyser2.getBrand());
            System.out.println("Capacity: " + geyser2.getCapacity() + " liters");
            System.out.println("Type: " + geyser2.getType());
            System.out.println("Power Rating: " + geyser2.getPowerRating() + " watts");
            System.out.println("Color: " + geyser2.getColor());
            System.out.println("Price: ₹" + geyser2.getPrice());
            System.out.println("Is Energy Efficient: " + geyser2.getIsEnergyEfficient());

            Geyser geyser3 = new Geyser();
            geyser3.setBrand("Venus");
            geyser3.setCapacity(10);
            geyser3.setType("Solar");
            geyser3.setPowerRating(0); // Solar geysers do not use electrical power
            geyser3.setColor("Green");
            geyser3.setPrice(12999.0);
            geyser3.setIsEnergyEfficient(true);

            System.out.println("Geyser Details:");
            System.out.println("Brand: " + geyser3.getBrand());
            System.out.println("Capacity: " + geyser3.getCapacity() + " liters");
            System.out.println("Type: " + geyser3.getType());
            System.out.println("Power Rating: " + geyser3.getPowerRating() + " watts");
            System.out.println("Color: " + geyser3.getColor());
            System.out.println("Price: ₹" + geyser3.getPrice());
            System.out.println("Is Energy Efficient: " + geyser3.getIsEnergyEfficient());

            Geyser geyser4 = new Geyser();
            geyser4.setBrand("AO Smith");
            geyser4.setCapacity(20);
            geyser4.setType("Electric");
            geyser4.setPowerRating(1800);
            geyser4.setColor("Blue");
            geyser4.setPrice(10999.0);
            geyser4.setIsEnergyEfficient(true);

            System.out.println("Geyser Details:");
            System.out.println("Brand: " + geyser4.getBrand());
            System.out.println("Capacity: " + geyser4.getCapacity() + " liters");
            System.out.println("Type: " + geyser4.getType());
            System.out.println("Power Rating: " + geyser4.getPowerRating() + " watts");
            System.out.println("Color: " + geyser4.getColor());
            System.out.println("Price: ₹" + geyser4.getPrice());
            System.out.println("Is Energy Efficient: " + geyser4.getIsEnergyEfficient());

            Geyser geyser5 = new Geyser();
            geyser5.setBrand("Usha");
            geyser5.setCapacity(30);
            geyser5.setType("Gas");
            geyser5.setPowerRating(1200);
            geyser5.setColor("Gold");
            geyser5.setPrice(7999.0);
            geyser5.setIsEnergyEfficient(false);

            System.out.println("Geyser Details:");
            System.out.println("Brand: " + geyser5.getBrand());
            System.out.println("Capacity: " + geyser5.getCapacity() + " liters");
            System.out.println("Type: " + geyser5.getType());
            System.out.println("Power Rating: " + geyser5.getPowerRating() + " watts");
            System.out.println("Color: " + geyser5.getColor());
            System.out.println("Price: ₹" + geyser5.getPrice());
            System.out.println("Is Energy Efficient: " + geyser5.getIsEnergyEfficient());
        }
    }

