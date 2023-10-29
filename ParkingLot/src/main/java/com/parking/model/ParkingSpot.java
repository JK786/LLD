package com.parking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpot {

    private  String id;

    private  Boolean isOccupied;

    private Car car;

    public ParkingSpot(String id, Boolean isOccupied) {
        this.id = id;
        this.isOccupied = isOccupied;
        this.car = null;
    }

}
