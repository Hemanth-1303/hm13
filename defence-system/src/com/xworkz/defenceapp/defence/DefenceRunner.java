package com.xworkz.defenceapp.defence;

public class DefenceRunner {
        public static void main(String[] args) {
            Defence officer1 = new Defence();
            officer1.setRole("Infantry Soldier");
            officer1.setBranch("Army");
            officer1.setServiceYears(5);
            officer1.setRank("Major");
            officer1.setSalary(75000.0);
            officer1.setBaseLocation("Delhi");
            officer1.setIsActiveService(true);

            System.out.println("Defence Details:");
            System.out.println("Role: " + officer1.getRole());
            System.out.println("Branch: " + officer1.getBranch());
            System.out.println("Service Years: " + officer1.getServiceYears());
            System.out.println("Rank: " + officer1.getRank());
            System.out.println("Salary: ₹" + officer1.getSalary());
            System.out.println("Base Location: " + officer1.getBaseLocation());
            System.out.println("Is Active Service: " + officer1.getIsActiveService());

            Defence officer2 = new Defence();
            officer2.setRole("Fighter Pilot");
            officer2.setBranch("Air Force");
            officer2.setServiceYears(12);
            officer2.setRank("Wing Commander");
            officer2.setSalary(120000.0);
            officer2.setBaseLocation("Bengaluru");
            officer2.setIsActiveService(true);

            System.out.println("Defence Details:");
            System.out.println("Role: " + officer2.getRole());
            System.out.println("Branch: " + officer2.getBranch());
            System.out.println("Service Years: " + officer2.getServiceYears());
            System.out.println("Rank: " + officer2.getRank());
            System.out.println("Salary: ₹" + officer2.getSalary());
            System.out.println("Base Location: " + officer2.getBaseLocation());
            System.out.println("Is Active Service: " + officer2.getIsActiveService());

            Defence officer3 = new Defence();
            officer3.setRole("Naval Officer");
            officer3.setBranch("Navy");
            officer3.setServiceYears(8);
            officer3.setRank("Commander");
            officer3.setSalary(95000.0);
            officer3.setBaseLocation("Mumbai");
            officer3.setIsActiveService(true);

            System.out.println("Defence Details:");
            System.out.println("Role: " + officer3.getRole());
            System.out.println("Branch: " + officer3.getBranch());
            System.out.println("Service Years: " + officer3.getServiceYears());
            System.out.println("Rank: " + officer3.getRank());
            System.out.println("Salary: ₹" + officer3.getSalary());
            System.out.println("Base Location: " + officer3.getBaseLocation());
            System.out.println("Is Active Service: " + officer3.getIsActiveService());

            Defence officer4 = new Defence();
            officer4.setRole("Intelligence Analyst");
            officer4.setBranch("Defence Intelligence Agency");
            officer4.setServiceYears(6);
            officer4.setRank("Captain");
            officer4.setSalary(85000.0);
            officer4.setBaseLocation("Hyderabad");
            officer4.setIsActiveService(false);

            System.out.println("Defence Details:");
            System.out.println("Role: " + officer4.getRole());
            System.out.println("Branch: " + officer4.getBranch());
            System.out.println("Service Years: " + officer4.getServiceYears());
            System.out.println("Rank: " + officer4.getRank());
            System.out.println("Salary: ₹" + officer4.getSalary());
            System.out.println("Base Location: " + officer4.getBaseLocation());
            System.out.println("Is Active Service: " + officer4.getIsActiveService());

            Defence officer5 = new Defence();
            officer5.setRole("Engineer");
            officer5.setBranch("Army Corps of Engineers");
            officer5.setServiceYears(10);
            officer5.setRank("Lieutenant Colonel");
            officer5.setSalary(105000.0);
            officer5.setBaseLocation("Chandigarh");
            officer5.setIsActiveService(true);

            System.out.println("Defence Details:");
            System.out.println("Role: " + officer5.getRole());
            System.out.println("Branch: " + officer5.getBranch());
            System.out.println("Service Years: " + officer5.getServiceYears());
            System.out.println("Rank: " + officer5.getRank());
            System.out.println("Salary: ₹" + officer5.getSalary());
            System.out.println("Base Location: " + officer5.getBaseLocation());
            System.out.println("Is Active Service: " + officer5.getIsActiveService());
        }
    }

