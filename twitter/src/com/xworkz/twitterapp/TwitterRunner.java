package com.xworkz.twitterapp;

import com.xworkz.twitterapp.constants.Gender;
import com.xworkz.twitterapp.twitterdto.TwitterDto;
import com.xworkz.twitterapp.generatetwitter.Twitter;

public class TwitterRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        TwitterDto twitterDto = new TwitterDto();
        twitterDto.setFullName("Hemanth");
        twitterDto.setDob("13/12/2003");
        twitterDto.setGender(Gender.Male);
        twitterDto.setEmail("hemanth@gmail.com");
        twitterDto.setMobile("9876501234L");
        twitterDto.setUserName("hemu");
        twitterDto.setPassword("hemu@123");

        System.out.println("The Full Name: " + twitterDto.getFullName());
        System.out.println("The DOB: " + twitterDto.getDob());
        System.out.println("The Gender: " + twitterDto.getGender());
        System.out.println("The Email: " + twitterDto.getEmail());
        System.out.println("The Mobile: " + twitterDto.getMobile());
        System.out.println("The Username: " + twitterDto.getUserName());
        System.out.println("The Password: " + twitterDto.getPassword());

        System.out.println("Main ended");

        Twitter twitter = new Twitter();
        twitter.newAccount(twitterDto);
    }
}
