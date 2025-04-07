package com.xworkz.mattressapp.mattress;

public class Mattress {
        private String material;
        private String size;
        private double thickness;
        private String brand;
        private double price;
        private boolean isFoldable;
        private String comfortLevel;

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getMaterial() {
            return material;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSize() {
            return size;
        }

        public void setThickness(double thickness) {
            this.thickness = thickness;
        }

        public double getThickness() {
            return thickness;
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

        public void setIsFoldable(boolean isFoldable) {
            this.isFoldable = isFoldable;
        }

        public boolean getIsFoldable() {
            return isFoldable;
        }

        public void setComfortLevel(String comfortLevel) {
            this.comfortLevel = comfortLevel;
        }

        public String getComfortLevel() {
            return comfortLevel;
        }
    }
