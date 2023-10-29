package com.parking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Ticket {

    private String ticketId;

    private String vehicleNumber;

    private String parkingSpotId;
}
