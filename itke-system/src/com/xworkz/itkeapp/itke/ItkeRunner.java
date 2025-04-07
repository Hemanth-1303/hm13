package com.xworkz.itkeapp.itke;

public class ItkeRunner {
        public static void main(String[] args) {
            Itke itke1 = new Itke();
            itke1.setName("Itke Model A");
            itke1.setCategory("Utility");
            itke1.setPrice(599.0);
            itke1.setManufacturer("Itke Co.");
            itke1.setIsAvailable(true);
            itke1.setWarrantyPeriod(2);
            itke1.setUsage("General household tasks");

            System.out.println("Itke Details:");
            System.out.println("Name: " + itke1.getName());
            System.out.println("Category: " + itke1.getCategory());
            System.out.println("Price: ₹" + itke1.getPrice());
            System.out.println("Manufacturer: " + itke1.getManufacturer());
            System.out.println("Is Available: " + itke1.getIsAvailable());
            System.out.println("Warranty Period: " + itke1.getWarrantyPeriod() + " years");
            System.out.println("Usage: " + itke1.getUsage());

            Itke itke2 = new Itke();
            itke2.setName("Itke Model B");
            itke2.setCategory("Specialized");
            itke2.setPrice(1299.0);
            itke2.setManufacturer("Itke Innovations");
            itke2.setIsAvailable(false);
            itke2.setWarrantyPeriod(1);
            itke2.setUsage("Professional use");

            System.out.println("Itke Details:");
            System.out.println("Name: " + itke2.getName());
            System.out.println("Category: " + itke2.getCategory());
            System.out.println("Price: ₹" + itke2.getPrice());
            System.out.println("Manufacturer: " + itke2.getManufacturer());
            System.out.println("Is Available: " + itke2.getIsAvailable());
            System.out.println("Warranty Period: " + itke2.getWarrantyPeriod() + " years");
            System.out.println("Usage: " + itke2.getUsage());

            Itke itke3 = new Itke();
            itke3.setName("Itke Model C");
            itke3.setCategory("Outdoor");
            itke3.setPrice(999.0);
            itke3.setManufacturer("Outdoor Itke Ltd.");
            itke3.setIsAvailable(true);
            itke3.setWarrantyPeriod(3);
            itke3.setUsage("Gardening and outdoor activities");

            System.out.println("Itke Details:");
            System.out.println("Name: " + itke3.getName());
            System.out.println("Category: " + itke3.getCategory());
            System.out.println("Price: ₹" + itke3.getPrice());
            System.out.println("Manufacturer: " + itke3.getManufacturer());
            System.out.println("Is Available: " + itke3.getIsAvailable());
            System.out.println("Warranty Period: " + itke3.getWarrantyPeriod() + " years");
            System.out.println("Usage: " + itke3.getUsage());

            Itke itke4 = new Itke();
            itke4.setName("Itke Model D");
            itke4.setCategory("Industrial");
            itke4.setPrice(2999.0);
            itke4.setManufacturer("Industrial Itke");
            itke4.setIsAvailable(false);
            itke4.setWarrantyPeriod(5);
            itke4.setUsage("Heavy-duty industrial tasks");

            System.out.println("Itke Details:");
            System.out.println("Name: " + itke4.getName());
            System.out.println("Category: " + itke4.getCategory());
            System.out.println("Price: ₹" + itke4.getPrice());
            System.out.println("Manufacturer: " + itke4.getManufacturer());
            System.out.println("Is Available: " + itke4.getIsAvailable());
            System.out.println("Warranty Period: " + itke4.getWarrantyPeriod() + " years");
            System.out.println("Usage: " + itke4.getUsage());

            Itke itke5 = new Itke();
            itke5.setName("Itke Model E");
            itke5.setCategory("Smart Appliance");
            itke5.setPrice(4999.0);
            itke5.setManufacturer("Smart Itke Corp.");
            itke5.setIsAvailable(true);
            itke5.setWarrantyPeriod(2);
            itke5.setUsage("Smart home automation");

            System.out.println("Itke Details:");
            System.out.println("Name: " + itke5.getName());
            System.out.println("Category: " + itke5.getCategory());
            System.out.println("Price: ₹" + itke5.getPrice());
            System.out.println("Manufacturer: " + itke5.getManufacturer());
            System.out.println("Is Available: " + itke5.getIsAvailable());
            System.out.println("Warranty Period: " + itke5.getWarrantyPeriod() + " years");
            System.out.println("Usage: " + itke5.getUsage());
        }
    }

