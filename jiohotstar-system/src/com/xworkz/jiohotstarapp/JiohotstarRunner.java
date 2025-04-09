package com.xworkz.jiohotstarapp;
import com.xworkz.jiohotstarapp.constants.SubscriptionType;
import com.xworkz.jiohotstarapp.jiohotstardto.JiohotstarDto;
import com.xworkz.jiohotstarapp.generatejiohotstar.Jiohotstar;

    public class JiohotstarRunner {

        public static void main(String[] args) {

            System.out.println("Main Started");

            JiohotstarDto dto = new JiohotstarDto();
            dto.setUserName("Hemanth");
            dto.setAccountID("JIOHOT123456");
            dto.setShowName("Breaking Bad");
            dto.setSubscriptionDate("2025-04-10");
            dto.setSubscriptionType(SubscriptionType.PREMIUM);

            System.out.println("User Name: " + dto.getUserName());
            System.out.println("Account ID: " + dto.getAccountID());
            System.out.println("Show Name: " + dto.getShowName());
            System.out.println("Subscription Date: " + dto.getSubscriptionDate());
            System.out.println("Subscription Type: " + dto.getSubscriptionType());

            System.out.println("Main Ended");

            Jiohotstar jioHotstar = new Jiohotstar();
            jioHotstar.watchShow(dto);
        }
    }
