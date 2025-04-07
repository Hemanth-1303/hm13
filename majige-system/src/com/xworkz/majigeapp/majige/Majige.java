package com.xworkz.majigeapp.majige;

public class Majige {
        private String brand;
        private double quantityInLiters;
        private double price;
        private boolean isSweetened;
        private String flavor;
        private String origin;
        private String packagingType;

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void setQuantityInLiters(double quantityInLiters) {
            this.quantityInLiters = quantityInLiters;
        }

        public double getQuantityInLiters() {
            return quantityInLiters;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setIsSweetened(boolean isSweetened) {
            this.isSweetened = isSweetened;
        }

        public boolean getIsSweetened() {
            return isSweetened;
        }

        public void setFlavor(String flavor) {
            this.flavor = flavor;
        }

        public String getFlavor() {
            return flavor;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getOrigin() {
            return origin;
        }

        public void setPackagingType(String packagingType) {
            this.packagingType = packagingType;
        }

        public String getPackagingType() {
            return packagingType;
        }
    }

