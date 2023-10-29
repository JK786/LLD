package com.parking.services.ParkingStrategy;

import com.parking.model.ParkingSpot;

import java.util.List;

public interface ParkingStrategy {

    //Gives the closet one
    ParkingSpot getParkingSpot(final List<ParkingSpot> parkingSpots,final Integer maxCapacity);


}
