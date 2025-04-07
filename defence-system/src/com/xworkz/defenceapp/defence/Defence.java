package com.xworkz.defenceapp.defence;

public class Defence {
        private String role;
        private String branch;
        private int serviceYears;
        private String rank;
        private double salary;
        private String baseLocation;
        private boolean isActiveService;


        public void setRole(String role) {
            this.role = role;
        }

        public String getRole() {
            return role;
        }

        public void setBranch(String branch) {
            this.branch = branch;
        }

        public String getBranch() {
            return branch;
        }

        public void setServiceYears(int serviceYears) {
            this.serviceYears = serviceYears;
        }

        public int getServiceYears() {
            return serviceYears;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getRank() {
            return rank;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        public void setBaseLocation(String baseLocation) {
            this.baseLocation = baseLocation;
        }

        public String getBaseLocation() {
            return baseLocation;
        }

        public void setIsActiveService(boolean isActiveService) {
            this.isActiveService = isActiveService;
        }

        public boolean getIsActiveService() {
            return isActiveService;
        }
    }


