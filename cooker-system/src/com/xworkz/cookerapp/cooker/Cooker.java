package com.xworkz.cookerapp.cooker;

public class Cooker {
        private String brand;
        private int capacity;
        private String material;
        private boolean isElectric;
        private int warrantyPeriod;
        private double price;
        private String type;

        // Mutators (Setters)
        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getMaterial() {
            return material;
        }

        public void setIsElectric(boolean isElectric) {
            this.isElectric = isElectric;
        }

        public boolean getIsElectric() {
            return isElectric;
        }

        public void setWarrantyPeriod(int warrantyPeriod) {
            this.warrantyPeriod = warrantyPeriod;
        }

        public int getWarrantyPeriod() {
            return warrantyPeriod;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

