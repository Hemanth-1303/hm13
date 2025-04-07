package com.xworkz.cropsapp.crops;

public class Crops {
        private String name;
        private String type;
        private String season;
        private double yieldPerHectare;
        private double pricePerKg;
        private String origin;
        private boolean isOrganic;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setSeason(String season) {
            this.season = season;
        }

        public String getSeason() {
            return season;
        }

        public void setYieldPerHectare(double yieldPerHectare) {
            this.yieldPerHectare = yieldPerHectare;
        }

        public double getYieldPerHectare() {
            return yieldPerHectare;
        }

        public void setPricePerKg(double pricePerKg) {
            this.pricePerKg = pricePerKg;
        }

        public double getPricePerKg() {
            return pricePerKg;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getOrigin() {
            return origin;
        }

        public void setIsOrganic(boolean isOrganic) {
            this.isOrganic = isOrganic;
        }

        public boolean getIsOrganic() {
            return isOrganic;
        }
    }

