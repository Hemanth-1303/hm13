package com.xworkz.itkeapp.itke;

public class Itke {
        private String name;
        private String category;
        private double price;
        private String manufacturer;
        private boolean isAvailable;
        private int warrantyPeriod;
        private String usage;

        // Mutators (Setters)
        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getCategory() {
            return category;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setIsAvailable(boolean isAvailable) {
            this.isAvailable = isAvailable;
        }

        public boolean getIsAvailable() {
            return isAvailable;
        }

        public void setWarrantyPeriod(int warrantyPeriod) {
            this.warrantyPeriod = warrantyPeriod;
        }

        public int getWarrantyPeriod() {
            return warrantyPeriod;
        }

        public void setUsage(String usage) {
            this.usage = usage;
        }

        public String getUsage() {
            return usage;
        }
    }

