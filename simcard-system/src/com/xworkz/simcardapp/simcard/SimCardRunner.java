package com.xworkz.simcardapp.simcard;

public class SimCardRunner {
        public static void main(String[] args) {
            SimCard sim1 = new SimCard();
            sim1.setProvider("Airtel");
            sim1.setType("Prepaid");
            sim1.setPhoneNumber("9876543210");
            sim1.setDataBalance(5.5);
            sim1.setCallBalance(100.0);
            sim1.setIsActive(true);
            sim1.setRegion("Karnataka");

            System.out.println("SimCard Details:");
            System.out.println("Provider: " + sim1.getProvider());
            System.out.println("Type: " + sim1.getType());
            System.out.println("Phone Number: " + sim1.getPhoneNumber());
            System.out.println("Data Balance: " + sim1.getDataBalance() + " GB");
            System.out.println("Call Balance: ₹" + sim1.getCallBalance());
            System.out.println("Is Active: " + sim1.getIsActive());
            System.out.println("Region: " + sim1.getRegion());

            SimCard sim2 = new SimCard();
            sim2.setProvider("Jio");
            sim2.setType("Postpaid");
            sim2.setPhoneNumber("9123456789");
            sim2.setDataBalance(10.0);
            sim2.setCallBalance(200.0);
            sim2.setIsActive(true);
            sim2.setRegion("Maharashtra");

            System.out.println("SimCard Details:");
            System.out.println("Provider: " + sim2.getProvider());
            System.out.println("Type: " + sim2.getType());
            System.out.println("Phone Number: " + sim2.getPhoneNumber());
            System.out.println("Data Balance: " + sim2.getDataBalance() + " GB");
            System.out.println("Call Balance: ₹" + sim2.getCallBalance());
            System.out.println("Is Active: " + sim2.getIsActive());
            System.out.println("Region: " + sim2.getRegion());

            SimCard sim3 = new SimCard();
            sim3.setProvider("Vi");
            sim3.setType("Prepaid");
            sim3.setPhoneNumber("8901234567");
            sim3.setDataBalance(3.0);
            sim3.setCallBalance(50.0);
            sim3.setIsActive(false);
            sim3.setRegion("Tamil Nadu");

            System.out.println("SimCard Details:");
            System.out.println("Provider: " + sim3.getProvider());
            System.out.println("Type: " + sim3.getType());
            System.out.println("Phone Number: " + sim3.getPhoneNumber());
            System.out.println("Data Balance: " + sim3.getDataBalance() + " GB");
            System.out.println("Call Balance: ₹" + sim3.getCallBalance());
            System.out.println("Is Active: " + sim3.getIsActive());
            System.out.println("Region: " + sim3.getRegion());

            SimCard sim4 = new SimCard();
            sim4.setProvider("BSNL");
            sim4.setType("Postpaid");
            sim4.setPhoneNumber("9008765432");
            sim4.setDataBalance(8.5);
            sim4.setCallBalance(150.0);
            sim4.setIsActive(true);
            sim4.setRegion("Kerala");

            System.out.println("SimCard Details:");
            System.out.println("Provider: " + sim4.getProvider());
            System.out.println("Type: " + sim4.getType());
            System.out.println("Phone Number: " + sim4.getPhoneNumber());
            System.out.println("Data Balance: " + sim4.getDataBalance() + " GB");
            System.out.println("Call Balance: ₹" + sim4.getCallBalance());
            System.out.println("Is Active: " + sim4.getIsActive());
            System.out.println("Region: " + sim4.getRegion());

            SimCard sim5 = new SimCard();
            sim5.setProvider("MTNL");
            sim5.setType("Prepaid");
            sim5.setPhoneNumber("9012345678");
            sim5.setDataBalance(6.0);
            sim5.setCallBalance(80.0);
            sim5.setIsActive(false);
            sim5.setRegion("Delhi");

            System.out.println("SimCard Details:");
            System.out.println("Provider: " + sim5.getProvider());
            System.out.println("Type: " + sim5.getType());
            System.out.println("Phone Number: " + sim5.getPhoneNumber());
            System.out.println("Data Balance: " + sim5.getDataBalance() + " GB");
            System.out.println("Call Balance: ₹" + sim5.getCallBalance());
            System.out.println("Is Active: " + sim5.getIsActive());
            System.out.println("Region: " + sim5.getRegion());
        }
    }

