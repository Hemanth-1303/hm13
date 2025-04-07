package com.xworkz.ladderapp.ladder;

public class LadderRunner {

        public static void main(String[] args) {
            Ladder ladder1 = new Ladder();
            ladder1.setMaterial("Aluminum");
            ladder1.setHeightInFeet(10.0);
            ladder1.setNumberOfSteps(8);
            ladder1.setWeightCapacityInKg(150.0);
            ladder1.setBrand("Alco");
            ladder1.setIsFoldable(true);
            ladder1.setApplication("Home Maintenance");

            System.out.println("Ladder Details:");
            System.out.println("The ladder material is " + ladder1.getMaterial());
            System.out.println("The ladder height is " + ladder1.getHeightInFeet() + " feet");
            System.out.println("The ladder has " + ladder1.getNumberOfSteps() + " steps");
            System.out.println("The ladder weight capacity is " + ladder1.getWeightCapacityInKg() + " kg");
            System.out.println("The ladder brand is " + ladder1.getBrand());
            System.out.println("Is the ladder foldable: " + ladder1.getIsFoldable());
            System.out.println("The ladder application is " + ladder1.getApplication());

            Ladder ladder2 = new Ladder();
            ladder2.setMaterial("Steel");
            ladder2.setHeightInFeet(15.0);
            ladder2.setNumberOfSteps(12);
            ladder2.setWeightCapacityInKg(200.0);
            ladder2.setBrand("EuroSteel");
            ladder2.setIsFoldable(false);
            ladder2.setApplication("Industrial Use");

            System.out.println("\nLadder Details:");
            System.out.println("The ladder material is " + ladder2.getMaterial());
            System.out.println("The ladder height is " + ladder2.getHeightInFeet() + " feet");
            System.out.println("The ladder has " + ladder2.getNumberOfSteps() + " steps");
            System.out.println("The ladder weight capacity is " + ladder2.getWeightCapacityInKg() + " kg");
            System.out.println("The ladder brand is " + ladder2.getBrand());
            System.out.println("Is the ladder foldable: " + ladder2.getIsFoldable());
            System.out.println("The ladder application is " + ladder2.getApplication());

            Ladder ladder3 = new Ladder();
            ladder3.setMaterial("Fiberglass");
            ladder3.setHeightInFeet(20.0);
            ladder3.setNumberOfSteps(15);
            ladder3.setWeightCapacityInKg(250.0);
            ladder3.setBrand("Werner");
            ladder3.setIsFoldable(true);
            ladder3.setApplication("Electric Work");

            System.out.println("\nLadder Details:");
            System.out.println("The ladder material is " + ladder3.getMaterial());
            System.out.println("The ladder height is " + ladder3.getHeightInFeet() + " feet");
            System.out.println("The ladder has " + ladder3.getNumberOfSteps() + " steps");
            System.out.println("The ladder weight capacity is " + ladder3.getWeightCapacityInKg() + " kg");
            System.out.println("The ladder brand is " + ladder3.getBrand());
            System.out.println("Is the ladder foldable: " + ladder3.getIsFoldable());
            System.out.println("The ladder application is " + ladder3.getApplication());

            Ladder ladder4 = new Ladder();
            ladder4.setMaterial("Wood");
            ladder4.setHeightInFeet(6.0);
            ladder4.setNumberOfSteps(5);
            ladder4.setWeightCapacityInKg(100.0);
            ladder4.setBrand("ClassicWood");
            ladder4.setIsFoldable(false);
            ladder4.setApplication("Decorative Use");

            System.out.println("\nLadder Details:");
            System.out.println("The ladder material is " + ladder4.getMaterial());
            System.out.println("The ladder height is " + ladder4.getHeightInFeet() + " feet");
            System.out.println("The ladder has " + ladder4.getNumberOfSteps() + " steps");
            System.out.println("The ladder weight capacity is " + ladder4.getWeightCapacityInKg() + " kg");
            System.out.println("The ladder brand is " + ladder4.getBrand());
            System.out.println("Is the ladder foldable: " + ladder4.getIsFoldable());
            System.out.println("The ladder application is " + ladder4.getApplication());

            Ladder ladder5 = new Ladder();
            ladder5.setMaterial("Plastic");
            ladder5.setHeightInFeet(4.0);
            ladder5.setNumberOfSteps(4);
            ladder5.setWeightCapacityInKg(50.0);
            ladder5.setBrand("EasyStep");
            ladder5.setIsFoldable(true);
            ladder5.setApplication("Kids Play");

            System.out.println("\nLadder Details:");
            System.out.println("The ladder material is " + ladder5.getMaterial());
            System.out.println("The ladder height is " + ladder5.getHeightInFeet() + " feet");
            System.out.println("The ladder has " + ladder5.getNumberOfSteps() + " steps");
            System.out.println("The ladder weight capacity is " + ladder5.getWeightCapacityInKg() + " kg");
            System.out.println("The ladder brand is " + ladder5.getBrand());
            System.out.println("Is the ladder foldable: " + ladder5.getIsFoldable());
            System.out.println("The ladder application is " + ladder5.getApplication());
        }
    }

