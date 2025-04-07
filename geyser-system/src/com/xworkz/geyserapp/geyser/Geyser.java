package com.xworkz.geyserapp.geyser;

public class Geyser {
        private String brand;
        private int capacity; // Capacity in liters
        private String type; // Electric, Gas, Solar, etc.
        private int powerRating; // Power rating in watts
        private String color;
        private double price;
        private boolean isEnergyEfficient;

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

        public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setPowerRating(int powerRating) {
            this.powerRating = powerRating;
        }

        public int getPowerRating() {
            return powerRating;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setIsEnergyEfficient(boolean isEnergyEfficient) {
            this.isEnergyEfficient = isEnergyEfficient;
        }

        public boolean getIsEnergyEfficient() {
            return isEnergyEfficient;
        }
    }


