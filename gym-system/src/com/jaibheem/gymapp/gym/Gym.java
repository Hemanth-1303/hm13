package com.jaibheem.gymapp.gym;
import com.jaibheem.gymapp.members.Members;
import com.jaibheem.gymapp.trainers.Trainers;


public class Gym {

        public int gymId;
        public String location;
        public String[] branches;
        public Trainers[] trainers;

        public void display(){
            System.out.println("* * * * * * * * * * * *");
            System.out.println("Gym ID: " + this.gymId);
            System.out.println("Gym Location: " + this.location);
            for(String branch : branches) {
                System.out.println("Gym Branch: " + branch);
            }

        }

}
