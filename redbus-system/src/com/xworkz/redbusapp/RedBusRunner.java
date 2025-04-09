package com.xworkz.redbusapp;

import com.xworkz.redbusapp.constants.SeatType;
import com.xworkz.redbusapp.redbusdto.RedBusDto;
import com.xworkz.redbusapp.generateredbus.RedBus;

public class RedBusRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        RedBusDto dto = new RedBusDto();
        dto.setUserName("Hemanth");
        dto.setBookingID("REDBUS123456");
        dto.setBusName("KSRTC Express");
        dto.setTravelDate("2025-04-15");
        dto.setSeatType(SeatType.SLEEPER);

        System.out.println("User Name: " + dto.getUserName());
        System.out.println("Booking ID: " + dto.getBookingID());
        System.out.println("Bus Name: " + dto.getBusName());
        System.out.println("Travel Date: " + dto.getTravelDate());
        System.out.println("Seat Type: " + dto.getSeatType());

        System.out.println("Main Ended");

        RedBus redBus = new RedBus();
        redBus.bookTicket(dto);
    }
}
