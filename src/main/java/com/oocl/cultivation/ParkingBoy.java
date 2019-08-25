package com.oocl.cultivation;

public class ParkingBoy {
    private final ParkingLot parkingLot;

    private String lastErrorMessage ;
    public ParkingBoy(ParkingLot parkingLot) {
        // TODO Auto-generated constructor stub
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        // TODO Auto-generated method stub

       if(parkingLot.parkCar(car) != null) {
            lastErrorMessage = null;
        }
     else{lastErrorMessage="The parking lot is full.";}
        return parkingLot.parkCar(car);
    }

    public Car fetch(ParkingTicket ticket) {
       Car  getCar =parkingLot.pickCar(ticket);
        if(ticket == null){
            lastErrorMessage = "Please provide your parking ticket.";
         }
        else if(getCar == null) {
            lastErrorMessage = "Unrecognized parking ticket.";
        }

    return   getCar;

    }

    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }
    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}