package com.parking.services;

import com.parking.model.Car;
import com.parking.model.ParkingLot;
import com.parking.model.ParkingSpot;
import com.parking.services.ParkingStrategy.ParkingStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@RequiredArgsConstructor
public class ParkingLotManagementService {

    private ParkingLot parkingLot;
    private ParkingStrategy parkingStrategy;


    public ParkingLot createParkingLot(final Integer parkingCapacity,final ParkingStrategy parkingStrategy) {

        if(this.parkingLot != null) {
            //TBD: Custom exception
            throw new RuntimeException("The parking lot is already created. Cannot create again.");
        }

        List<ParkingSpot> parkingSpots = new ArrayList<>();

        for(int i=0;i<parkingCapacity ;i++) {
            parkingSpots.add(new ParkingSpot("" + i,Boolean.FALSE));
        }

        this.parkingLot = new ParkingLot(parkingSpots);
        this.parkingStrategy = parkingStrategy;
        System.out.println("Successfully created a parking lot");

        //TBD: No need to return
        return (this).parkingLot;
    }

    public void park(final Car car) {

        ParkingSpot parkingSpot = this.parkingStrategy.getParkingSpot(this.parkingLot.getParkingSpotList(),ParkingLot.MAX_CAPACITY);
        final String parkinglotId = this.parkingLot.park(parkingSpot,car);
        System.out.println("Allocated slot number : " + parkinglotId);
    }

    public void unpark(final String parkingSlotId) {
        this.parkingLot.unpark(parkingSlotId);
    }

    public void destroySystem() {

    }

    public void getCarsWithColor(final String colour) {

    }

    public void getSlotForCar(final String vehicleRegistrationNumber) {

    }


}
