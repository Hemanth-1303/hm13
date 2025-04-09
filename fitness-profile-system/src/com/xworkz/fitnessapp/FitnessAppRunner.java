package com.xworkz.fitnessapp;

import com.xworkz.fitnessapp.constants.FitnessGoal;
import com.xworkz.fitnessapp.dto.FitnessUserProfileDto;
import com.xworkz.fitnessapp.generate.FitnessApp;

public class FitnessAppRunner {

    public static void main(String[] args) {

        System.out.println("Main started");

        FitnessUserProfileDto dto = new FitnessUserProfileDto();
        dto.setUserName("Akash");
        dto.setEmail("akash.fitness@gmail.com");
        dto.setAge(32);
        dto.setWeight(69.5);
        dto.setHeight(5.10);
        dto.setGoal(FitnessGoal.MUSCLE_GAIN);
        dto.setPreferredWorkoutTime("Morning");

        System.out.println("User Name: " + dto.getUserName());
        System.out.println("Email: " + dto.getEmail());
        System.out.println("Age: " + dto.getAge());
        System.out.println("Weight: " + dto.getWeight());
        System.out.println("Height: " + dto.getHeight());
        System.out.println("Fitness Goal: " + dto.getGoal());
        System.out.println("Workout Time: " + dto.getPreferredWorkoutTime());

        System.out.println("Main ended");

        FitnessApp app = new FitnessApp();
        app.registerUser(dto);
    }
}
