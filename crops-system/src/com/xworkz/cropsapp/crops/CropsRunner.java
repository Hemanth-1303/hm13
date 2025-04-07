package com.xworkz.cropsapp.crops;

public class CropsRunner {

        public static void main(String[] args) {
            Crops crop1 = new Crops();
            crop1.setName("Rice");
            crop1.setType("Cereal");
            crop1.setSeason("Kharif");
            crop1.setYieldPerHectare(3.5);
            crop1.setPricePerKg(50.0);
            crop1.setOrigin("India");
            crop1.setIsOrganic(true);

            System.out.println("Crops Details:");
            System.out.println("The crop name is " + crop1.getName());
            System.out.println("The crop type is " + crop1.getType());
            System.out.println("The crop season is " + crop1.getSeason());
            System.out.println("The crop yield per hectare is " + crop1.getYieldPerHectare() + " tonnes");
            System.out.println("The crop price per kg is " + crop1.getPricePerKg());
            System.out.println("The crop origin is " + crop1.getOrigin());
            System.out.println("Is the crop organic: " + crop1.getIsOrganic());

            Crops crop2 = new Crops();
            crop2.setName("Wheat");
            crop2.setType("Cereal");
            crop2.setSeason("Rabi");
            crop2.setYieldPerHectare(2.8);
            crop2.setPricePerKg(45.0);
            crop2.setOrigin("India");
            crop2.setIsOrganic(false);

            System.out.println("\nCrops Details:");
            System.out.println("The crop name is " + crop2.getName());
            System.out.println("The crop type is " + crop2.getType());
            System.out.println("The crop season is " + crop2.getSeason());
            System.out.println("The crop yield per hectare is " + crop2.getYieldPerHectare() + " tonnes");
            System.out.println("The crop price per kg is " + crop2.getPricePerKg());
            System.out.println("The crop origin is " + crop2.getOrigin());
            System.out.println("Is the crop organic: " + crop2.getIsOrganic());

            Crops crop3 = new Crops();
            crop3.setName("Tomato");
            crop3.setType("Vegetable");
            crop3.setSeason("Kharif");
            crop3.setYieldPerHectare(25.0);
            crop3.setPricePerKg(20.0);
            crop3.setOrigin("Italy");
            crop3.setIsOrganic(true);

            System.out.println("\nCrops Details:");
            System.out.println("The crop name is " + crop3.getName());
            System.out.println("The crop type is " + crop3.getType());
            System.out.println("The crop season is " + crop3.getSeason());
            System.out.println("The crop yield per hectare is " + crop3.getYieldPerHectare() + " tonnes");
            System.out.println("The crop price per kg is " + crop3.getPricePerKg());
            System.out.println("The crop origin is " + crop3.getOrigin());
            System.out.println("Is the crop organic: " + crop3.getIsOrganic());

            Crops crop4 = new Crops();
            crop4.setName("Potato");
            crop4.setType("Root");
            crop4.setSeason("Rabi");
            crop4.setYieldPerHectare(20.0);
            crop4.setPricePerKg(25.0);
            crop4.setOrigin("Peru");
            crop4.setIsOrganic(false);

            System.out.println("\nCrops Details:");
            System.out.println("The crop name is " + crop4.getName());
            System.out.println("The crop type is " + crop4.getType());
            System.out.println("The crop season is " + crop4.getSeason());
            System.out.println("The crop yield per hectare is " + crop4.getYieldPerHectare() + " tonnes");
            System.out.println("The crop price per kg is " + crop4.getPricePerKg());
            System.out.println("The crop origin is " + crop4.getOrigin());
            System.out.println("Is the crop organic: " + crop4.getIsOrganic());

            Crops crop5 = new Crops();
            crop5.setName("Cotton");
            crop5.setType("Fiber");
            crop5.setSeason("Kharif");
            crop5.setYieldPerHectare(0.8);
            crop5.setPricePerKg(150.0);
            crop5.setOrigin("United States");
            crop5.setIsOrganic(true);

            System.out.println("\nCrops Details:");
            System.out.println("The crop name is " + crop5.getName());
            System.out.println("The crop type is " + crop5.getType());
            System.out.println("The crop season is " + crop5.getSeason());
            System.out.println("The crop yield per hectare is " + crop5.getYieldPerHectare() + " tonnes");
            System.out.println("The crop price per kg is " + crop5.getPricePerKg());
            System.out.println("The crop origin is " + crop5.getOrigin());
            System.out.println("Is the crop organic: " + crop5.getIsOrganic());
        }
    }
