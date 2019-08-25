package com.oocl.cultivation;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
   // private Car car;
   // Private ParkingTicket ticket;
   private final int capacity;
    private Map<ParkingTicket, Car> cars = new HashMap<>();

    public ParkingLot() {
        this(10);
    }

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }


    public ParkingTicket parkCar(Car car) {
        ParkingTicket ticket;
       if(cars.size()>=capacity) {
           ticket = null;
       }
       else {
        ParkingTicket newTicket = new ParkingTicket();
        ticket = newTicket;
        cars.put(ticket, car);}
        return ticket;
    }

    public Car pickCar(ParkingTicket ticket) {
       Car car = cars.get(ticket);
        cars.remove(ticket);
        return car;

    }
    public int getAvailableParkingPosition() {
        return cars.size() - capacity;
    }
}
