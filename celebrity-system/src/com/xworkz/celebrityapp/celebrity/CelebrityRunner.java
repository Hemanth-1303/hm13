package com.xworkz.celebrityapp.celebrity;

public class CelebrityRunner {
        public static void main(String[] args) {
            Celebrity celebrity1 = new Celebrity();
            celebrity1.setName("Leonardo DiCaprio");
            celebrity1.setAge(48);
            celebrity1.setProfession("Actor");
            celebrity1.setNationality("American");
            celebrity1.setAwardsWon(54);
            celebrity1.setNetWorth(260.0);
            celebrity1.setIsPhilanthropist(true);

            String name = celebrity1.getName();
            int age = celebrity1.getAge();
            String profession = celebrity1.getProfession();
            String nationality = celebrity1.getNationality();
            int awardwon = celebrity1.getAwardsWon();
            double networth = celebrity1.getNetWorth();
            boolean isphilanthropist = celebrity1.getIsPhilanthropist();

            System.out.println("Celebrity Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Profession: " + profession);
            System.out.println("Nationality: " + nationality);
            System.out.println("Awards Won: " + awardwon);
            System.out.println("Net Worth: $" + networth + " million");
            System.out.println("Is Philanthropist: " + isphilanthropist);

            Celebrity celebrity2 = new Celebrity();
            celebrity2.setName("Beyoncé");
            celebrity2.setAge(41);
            celebrity2.setProfession("Singer");
            celebrity2.setNationality("American");
            celebrity2.setAwardsWon(32);
            celebrity2.setNetWorth(500.0);
            celebrity2.setIsPhilanthropist(true);

            System.out.println("Celebrity Details:");
            System.out.println("Name: " + celebrity2.getName());
            System.out.println("Age: " + celebrity2.getAge());
            System.out.println("Profession: " + celebrity2.getProfession());
            System.out.println("Nationality: " + celebrity2.getNationality());
            System.out.println("Awards Won: " + celebrity2.getAwardsWon());
            System.out.println("Net Worth: $" + celebrity2.getNetWorth() + " million");
            System.out.println("Is Philanthropist: " + celebrity2.getIsPhilanthropist());

            Celebrity celebrity3 = new Celebrity();
            celebrity3.setName("Cristiano Ronaldo");
            celebrity3.setAge(38);
            celebrity3.setProfession("Footballer");
            celebrity3.setNationality("Portuguese");
            celebrity3.setAwardsWon(70);
            celebrity3.setNetWorth(500.0);
            celebrity3.setIsPhilanthropist(false);

            System.out.println("Celebrity Details:");
            System.out.println("Name: " + celebrity3.getName());
            System.out.println("Age: " + celebrity3.getAge());
            System.out.println("Profession: " + celebrity3.getProfession());
            System.out.println("Nationality: " + celebrity3.getNationality());
            System.out.println("Awards Won: " + celebrity3.getAwardsWon());
            System.out.println("Net Worth: $" + celebrity3.getNetWorth() + " million");
            System.out.println("Is Philanthropist: " + celebrity3.getIsPhilanthropist());

            Celebrity celebrity4 = new Celebrity();
            celebrity4.setName("Emma Watson");
            celebrity4.setAge(33);
            celebrity4.setProfession("Actress");
            celebrity4.setNationality("British");
            celebrity4.setAwardsWon(16);
            celebrity4.setNetWorth(85.0);
            celebrity4.setIsPhilanthropist(true);

            System.out.println("Celebrity Details:");
            System.out.println("Name: " + celebrity4.getName());
            System.out.println("Age: " + celebrity4.getAge());
            System.out.println("Profession: " + celebrity4.getProfession());
            System.out.println("Nationality: " + celebrity4.getNationality());
            System.out.println("Awards Won: " + celebrity4.getAwardsWon());
            System.out.println("Net Worth: $" + celebrity4.getNetWorth() + " million");
            System.out.println("Is Philanthropist: " + celebrity4.getIsPhilanthropist());

            Celebrity celebrity5 = new Celebrity();
            celebrity5.setName("Elon Musk");
            celebrity5.setAge(51);
            celebrity5.setProfession("Entrepreneur");
            celebrity5.setNationality("American");
            celebrity5.setAwardsWon(5);
            celebrity5.setNetWorth(250000.0); // In million dollars
            celebrity5.setIsPhilanthropist(false);

            System.out.println("Celebrity Details:");
            System.out.println("Name: " + celebrity5.getName());
            System.out.println("Age: " + celebrity5.getAge());
            System.out.println("Profession: " + celebrity5.getProfession());
            System.out.println("Nationality: " + celebrity5.getNationality());
            System.out.println("Awards Won: " + celebrity5.getAwardsWon());
            System.out.println("Net Worth: $" + celebrity5.getNetWorth() + " million");
            System.out.println("Is Philanthropist: " + celebrity5.getIsPhilanthropist());
        }
    }


