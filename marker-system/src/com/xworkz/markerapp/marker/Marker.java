package com.xworkz.markerapp.marker;

public class Marker {
        private String color;
        private String type;
        private double price;
        private String brand;
        private double length;
        private double tipSize;
        private boolean isPermanent;

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getLength() {
            return length;
        }

        public void setTipSize(double tipSize) {
            this.tipSize = tipSize;
        }

        public double getTipSize() {
            return tipSize;
        }

        public void setIsPermanent(boolean isPermanent) {
            this.isPermanent = isPermanent;
        }

        public boolean getIsPermanent() {
            return isPermanent;
        }
    }


