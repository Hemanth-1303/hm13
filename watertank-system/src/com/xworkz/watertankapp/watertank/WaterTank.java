package com.xworkz.watertankapp.watertank;

public class WaterTank {
        private String material;
        private double capacityInLiters;
        private String color;
        private String brand;
        private boolean isInsulated;
        private double price;
        private String shape;

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getMaterial() {
            return material;
        }

        public void setCapacityInLiters(double capacityInLiters) {
            this.capacityInLiters = capacityInLiters;
        }

        public double getCapacityInLiters() {
            return capacityInLiters;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void setIsInsulated(boolean isInsulated) {
            this.isInsulated = isInsulated;
        }

        public boolean getIsInsulated() {
            return isInsulated;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }

        public String getShape() {
            return shape;
        }
    }


