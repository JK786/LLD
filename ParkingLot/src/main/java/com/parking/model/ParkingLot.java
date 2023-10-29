package com.parking.model;

import com.parking.services.ParkingStrategy.ParkingStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;


@Getter
@RequiredArgsConstructor
public class ParkingLot {

    public static Integer MAX_CAPACITY = 10000;

    private final List<ParkingSpot> parkingSpotList;


    public String park(ParkingSpot parkingSpot,Car car) {
        if(parkingSpot.getIsOccupied()) {
            throw new IllegalArgumentException("Parking slot is already occupied");
        }

       parkingSpot.setCar(car);
       parkingSpot.setIsOccupied(Boolean.TRUE);

       return parkingSpot.getId();
    }

}
