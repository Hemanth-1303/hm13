package com.xworkz.netflixapp;
import com.xworkz.netflixapp.constants.SubscriptionType;
import com.xworkz.netflixapp.netflixdto.NetflixDto;
import com.xworkz.netflixapp.generatenetflix.Netflix;

    public class NetflixRunner {
        public static void main(String[] args) {

            System.out.println("Main Started");

            NetflixDto dto = new NetflixDto();
            dto.setUserName("Hemanth");
            dto.setUserID("NET123456");
            dto.setMovieTitle("Spiderman");
            dto.setSubscriptionDate("2025-04-10");
            dto.setSubscriptionType(SubscriptionType.PREMIUM);

            System.out.println("User Name: " + dto.getUserName());
            System.out.println("User ID: " + dto.getUserID());
            System.out.println("Movie Title: " + dto.getMovieTitle());
            System.out.println("Subscription Date: " + dto.getSubscriptionDate());
            System.out.println("Subscription Type: " + dto.getSubscriptionType());

            System.out.println("Main Ended");

            Netflix netflix = new Netflix();
            netflix.watchMovie(dto);
        }
    }


