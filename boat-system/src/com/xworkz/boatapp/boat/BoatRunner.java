package com.xworkz.boatapp.boat;

public class BoatRunner {

    public static void main(String args[]){
        Boat ref = new Boat();
        ref.setBoatId(1);
        ref.setBoatName("babas boat");
        ref.setBoatOwner("hemu");
        ref.setBoatType("Motor Boat");

        int boatId = ref.getBoatId();
        String boatOwner = ref.getBoatOwner();
        String boatName = ref.getBoatName();
        String boatType = ref.getBoatType();

        System.out.println("The boat id is "+boatId);
        System.out.println("The boat name is "+boatName);
        System.out.println("The boat owner is "+boatOwner);
        System.out.println("The boat type is "+boatType);

    }
}
