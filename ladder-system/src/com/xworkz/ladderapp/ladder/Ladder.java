package com.xworkz.ladderapp.ladder;

public class Ladder {
        private String material;
        private double heightInFeet;
        private int numberOfSteps;
        private double weightCapacityInKg;
        private String brand;
        private boolean isFoldable;
        private String application;

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getMaterial() {
            return material;
        }

        public void setHeightInFeet(double heightInFeet) {
            this.heightInFeet = heightInFeet;
        }

        public double getHeightInFeet() {
            return heightInFeet;
        }

        public void setNumberOfSteps(int numberOfSteps) {
            this.numberOfSteps = numberOfSteps;
        }

        public int getNumberOfSteps() {
            return numberOfSteps;
        }

        public void setWeightCapacityInKg(double weightCapacityInKg) {
            this.weightCapacityInKg = weightCapacityInKg;
        }

        public double getWeightCapacityInKg() {
            return weightCapacityInKg;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void setIsFoldable(boolean isFoldable) {
            this.isFoldable = isFoldable;
        }

        public boolean getIsFoldable() {
            return isFoldable;
        }

        public void setApplication(String application) {
            this.application = application;
        }

        public String getApplication() {
            return application;
        }
    }

