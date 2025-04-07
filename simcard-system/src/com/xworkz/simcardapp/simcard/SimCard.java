package com.xworkz.simcardapp.simcard;

public class SimCard {
        private String provider;
        private String type;
        private String phoneNumber;
        private double dataBalance;
        private double callBalance;
        private boolean isActive;
        private String region;

        // Mutators (Setters)
        public void setProvider(String provider) {
            this.provider = provider;
        }

        public String getProvider() {
            return provider;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setDataBalance(double dataBalance) {
            this.dataBalance = dataBalance;
        }

        public double getDataBalance() {
            return dataBalance;
        }

        public void setCallBalance(double callBalance) {
            this.callBalance = callBalance;
        }

        public double getCallBalance() {
            return callBalance;
        }

        public void setIsActive(boolean isActive) {
            this.isActive = isActive;
        }

        public boolean getIsActive() {
            return isActive;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getRegion() {
            return region;
        }
    }

