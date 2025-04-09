package com.xworkz.netflixapp.generatenetflix;
import com.xworkz.netflixapp.netflixdto.NetflixDto;

    public class Netflix {
        public boolean watchMovie(NetflixDto dto) {
            boolean accessGranted = false;
            boolean validated = validateAccount(dto);
            if (validated) {
                accessGranted = true;
                System.out.println("Account verified");
            } else {
                System.out.println("Account verified failed");
            }
            return accessGranted;
        }

        public boolean validateAccount(NetflixDto dto) {
            boolean accountValidated = false;

            boolean nameValid = false;
            boolean userIDValid = false;
            boolean movieValid = false;
            boolean subscriptionValid = false;
            boolean typeValid = false;

            if (dto.getUserName() != null && !dto.getUserName().isEmpty()) {
                nameValid = true;
            } else {
                System.out.println("Invalid User Name!");
            }

            if (dto.getUserID() != null && !dto.getUserID().isEmpty()) {
                userIDValid = true;
            } else {
                System.out.println("Invalid User ID!");
            }

            if (dto.getMovieTitle() != null && !dto.getMovieTitle().isEmpty()) {
                movieValid = true;
            } else {
                System.out.println("Invalid Movie Title!");
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

            if (nameValid && userIDValid && movieValid && subscriptionValid && typeValid) {
                accountValidated = true;
            }

            return accountValidated;
        }
    }


