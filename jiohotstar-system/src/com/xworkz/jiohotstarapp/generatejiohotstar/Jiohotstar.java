package com.xworkz.jiohotstarapp.generatejiohotstar;
import com.xworkz.jiohotstarapp.jiohotstardto.JiohotstarDto;

    public class Jiohotstar {
        public boolean watchShow(JiohotstarDto dto) {
            boolean accessGranted = false;
            boolean validated = validateAccount(dto);
            if (validated) {
                accessGranted = true;
                System.out.println("Enjoy streaming the show!");
            } else {
                System.out.println("Validation failed. Please check your account details.");
            }
            return accessGranted;
        }

        public boolean validateAccount(JiohotstarDto dto) {
            boolean accountValidated = false;

            boolean nameValid = false;
            boolean accountIDValid = false;
            boolean showValid = false;
            boolean subscriptionValid = false;
            boolean typeValid = false;

            if (dto.getUserName() != null && !dto.getUserName().isEmpty()) {
                nameValid = true;
            } else {
                System.out.println("Invalid User Name!");
            }

            if (dto.getAccountID() != null && !dto.getAccountID().isEmpty()) {
                accountIDValid = true;
            } else {
                System.out.println("Invalid Account ID!");
            }

            if (dto.getShowName() != null && !dto.getShowName().isEmpty()) {
                showValid = true;
            } else {
                System.out.println("Invalid Show Name!");
            }

            if (dto.getSubscriptionDate() != null && !dto.getSubscriptionDate().isEmpty()) {
                subscriptionValid = true;
            } else {
                System.out.println("Invalid Subscription Date!");
            }

            if (dto.getSubscriptionType() != null) {
                typeValid = true;
            } else {
                System.out.println("Invalid Subscription Type!");
            }

            if (nameValid && accountIDValid && showValid && subscriptionValid && typeValid) {
                accountValidated = true;
            }

            return accountValidated;
        }
    }


