package com.xworkz.redbusapp.generateredbus;

import com.xworkz.redbusapp.redbusdto.RedBusDto;

public class RedBus {

    public boolean bookTicket(RedBusDto dto) {
        boolean accessGranted = false;
        boolean validated = validateBooking(dto);
        if (validated) {
            accessGranted = true;
            System.out.println("Booking Confirmed! Enjoy your journey.");
        } else {
            System.out.println("Validation failed. Please check your booking details.");
        }
        return accessGranted;
    }

    public boolean validateBooking(RedBusDto dto) {
        boolean bookingValidated = false;

        boolean nameValid = false;
        boolean bookingIDValid = false;
        boolean busNameValid = false;
        boolean travelDateValid = false;
        boolean seatTypeValid = false;

        if (dto.getUserName() != null && !dto.getUserName().isEmpty()) {
            nameValid = true;
        } else {
            System.out.println("Invalid User Name!");
        }

        if (dto.getBookingID() != null && !dto.getBookingID().isEmpty()) {
            bookingIDValid = true;
        } else {
            System.out.println("Invalid Booking ID!");
        }

        if (dto.getBusName() != null && !dto.getBusName().isEmpty()) {
            busNameValid = true;
        } else {
            System.out.println("Invalid Bus Name!");
        }

        if (dto.getTravelDate() != null && !dto.getTravelDate().isEmpty()) {
            travelDateValid = true;
        } else {
            System.out.println("Invalid Travel Date!");
        }

        if (dto.getSeatType() != null) {
            seatTypeValid = true;
        } else {
            System.out.println("Invalid Seat Type!");
        }

        if (nameValid && bookingIDValid && busNameValid && travelDateValid && seatTypeValid) {
            bookingValidated = true;
        }

        return bookingValidated;
    }
}
