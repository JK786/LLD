package com.parking.services.ParkingStrategy;

import com.parking.model.ParkingSpot;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
public class ClosestToEntranceParkingStrategy implements  ParkingStrategy{


    @Override
    public ParkingSpot getParkingSpot(List<ParkingSpot> parkingSpots,final Integer maxCapacity) {

        if(parkingSpots.size() == maxCapacity) {
            throw new IllegalArgumentException("The parking is full");
        }

        for(int i=0;i<parkingSpots.size();i++) {
            if(!parkingSpots.get(i).getIsOccupied()) {
                return parkingSpots.get(i);
            }
        }

        throw new IllegalArgumentException("The parking could not be allocated");
    }


}
