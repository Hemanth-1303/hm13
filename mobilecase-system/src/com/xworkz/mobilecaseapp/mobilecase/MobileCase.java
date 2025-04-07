package com.xworkz.mobilecaseapp.mobilecase;

public class MobileCase {
        private String brandName;
        private String material;
        private String color;
        private double price;
        private String size;
        private boolean isWaterproof;
        private String compatibility;

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getMaterial() {
            return material;
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

        public void setSize(String size) {
            this.size = size;
        }

        public String getSize() {
            return size;
        }

        public void setIsWaterproof(boolean isWaterproof) {
            this.isWaterproof = isWaterproof;
        }

        public boolean getIsWaterproof() {
            return isWaterproof;
        }

        public void setCompatibility(String compatibility) {
            this.compatibility = compatibility;
        }

        public String getCompatibility() {
            return compatibility;
        }
    }

