package com.xworkz.shirtapp.shirt;

public class Shirt {
        private String size;
        private String color;
        private String fabric;
        private String brand;
        private double price;
        private String sleeveType;
        private boolean isFormal;

        public void setSize(String size) {
            this.size = size;
        }

        public String getSize() {
            return size;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setFabric(String fabric) {
            this.fabric = fabric;
        }

        public String getFabric() {
            return fabric;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setSleeveType(String sleeveType) {
            this.sleeveType = sleeveType;
        }

        public String getSleeveType() {
            return sleeveType;
        }

        public void setIsFormal(boolean isFormal) {
            this.isFormal = isFormal;
        }

        public boolean getIsFormal() {
            return isFormal;
        }
    }


