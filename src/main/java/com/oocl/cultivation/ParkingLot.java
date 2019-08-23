package com.oocl.cultivation;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private final int capacity;
    private Map<ParkingTicket, Car> cars = new HashMap<>();

    public ParkingLot() {
        this(10);
    }

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }
    public ParkingTicket park(Car car) {
        ParkingTicket ticket=new ParkingTicket();
        cars.put(ticket,car);
        return ticket;
       }
    
    public int getAvailableParkingPosition() {
        return capacity - cars.size();
    }
}
