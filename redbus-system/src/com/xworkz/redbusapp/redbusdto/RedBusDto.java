package com.xworkz.redbusapp.redbusdto;

import com.xworkz.redbusapp.constants.SeatType;

public class RedBusDto {
    private String userName;
    private String bookingID;
    private String busName;
    private String travelDate;
    private SeatType seatType;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getBusName() {
        return busName;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public SeatType getSeatType() {
        return seatType;
    }
}
