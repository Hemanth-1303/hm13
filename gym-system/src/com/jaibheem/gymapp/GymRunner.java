package com.jaibheem.gymapp;
import com.jaibheem.gymapp.members.Members;
import com.jaibheem.gymapp.gym.Gym;
import com.jaibheem.gymapp.trainers.Trainers;

public class GymRunner {
    public static void main(String args[]){
            System.out.println("Main started");

            // Trainer data
            String[] specializationsForTrainer1 = {"Weightlifting", "Cardio"};
            String[] specializationsForTrainer2 = {"Yoga", "Aerobics"};
            String[] gymBranches = {"Koramangala", "Whitefield"};

            Trainers trainer1 = new Trainers();
            trainer1.trainerId = 101;
            trainer1.trainerName = "John Doe";
            trainer1.specializations = specializationsForTrainer1;

            Trainers trainer2 = new Trainers();
            trainer2.trainerId = 102;
            trainer2.trainerName = "Jane Smith";
            trainer2.specializations = specializationsForTrainer2;

            Trainers[] trainers = new Trainers[2];
            trainers[0] = trainer1;
            trainers[1] = trainer2;

            // Gym data
            Gym gym = new Gym();
            gym.gymId = 1;
            gym.location = "Indiranagar";
            gym.branches = gymBranches;
            gym.trainers = trainers;

            // Display details
            gym.display();
            trainer1.trainerDisplay();
            trainer2.trainerDisplay();

            System.out.println("Main ended");
        }
}


