package com.parking.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;


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


    public void unpark(String spotId) {

        for(int i=0;i<parkingSpotList.size();i++)
        {
            if(parkingSpotList.get(i).getId().equals(spotId)) {
                parkingSpotList.get(i).setCar(null);
                parkingSpotList.get(i).setIsOccupied(Boolean.FALSE);
            }
        }
    }
}
