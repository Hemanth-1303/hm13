package com.xworkz.celebrityapp.celebrity;

public class Celebrity {
        private String name;
        private int age;
        private String profession;
        private String nationality;
        private int awardsWon;
        private double netWorth;
        private boolean isPhilanthropist;

        // Mutators (Setters)
        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setProfession(String profession) {
            this.profession = profession;
        }

        public String getProfession() {
            return profession;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public String getNationality() {
            return nationality;
        }

        public void setAwardsWon(int awardsWon) {
            this.awardsWon = awardsWon;
        }

        public int getAwardsWon() {
            return awardsWon;
        }

        public void setNetWorth(double netWorth) {
            this.netWorth = netWorth;
        }

        public double getNetWorth() {
            return netWorth;
        }

        public void setIsPhilanthropist(boolean isPhilanthropist) {
            this.isPhilanthropist = isPhilanthropist;
        }

        public boolean getIsPhilanthropist() {
            return isPhilanthropist;
        }
    }


