package com.xworkz.instagramapp;

import com.xworkz.instagramapp.constants.Gender;
import com.xworkz.instagramapp.instagramdto.InstagramDto;
import com.xworkz.instagramapp.generateinstagram.Instagram;

public class InstagramRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        InstagramDto instagramDto = new InstagramDto();
        instagramDto.setFirstName("Prajwal");
        instagramDto.setLastName("Gowda");
        instagramDto.setDob("03/03/2003");
        instagramDto.setGender(Gender.Male);
        instagramDto.setEmail("prajwalgowda@gmail.com");
        instagramDto.setMobile("9876543210");
        instagramDto.setUserName("prajwal_gowda");
        instagramDto.setPassword("prajwal@123");

        System.out.println("The First Name: " + instagramDto.getFirstName());
        System.out.println("The Last Name: " + instagramDto.getLastName());
        System.out.println("The DOB: " + instagramDto.getDob());
        System.out.println("The Gender: " + instagramDto.getGender());
        System.out.println("The Email: " + instagramDto.getEmail());
        System.out.println("The Mobile: " + instagramDto.getMobile());
        System.out.println("The Username: " + instagramDto.getUserName());
        System.out.println("The Password: " + instagramDto.getPassword());

        System.out.println("Main Ended");

        Instagram instagram = new Instagram();
        instagram.newAccount(instagramDto);
    }
}
