package com.jaibheem.gymapp.trainers;
import com.jaibheem.gymapp.members.Members;

public class Trainers {
    public int trainerId;
    public String trainerName;
    public String[] specializations;

    public void trainerDisplay() {
        System.out.println("* * * * * * * * * * * *");
        System.out.println("Trainer ID: " + this.trainerId);
        System.out.println("Trainer Name: " + this.trainerName);
        System.out.println("Specializations:");
        for (String specialization : specializations) {
            System.out.println("- " + specialization);
        }
    }
}

