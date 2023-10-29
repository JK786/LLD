package com.parking.services.CommandStrategy;

import com.parking.model.Command;
import com.parking.services.ParkingLotManagementService;

public class VacateSpotCommandExecutor extends  CommandExecutor {

    public VacateSpotCommandExecutor(ParkingLotManagementService parkingLotManagementService) {
        super(parkingLotManagementService);
    }

    @Override
    public void execute(Command command) {

        final String spotId = command.getArgs().get(0);
        this.parkingLotManagementService.unpark(spotId);
        System.out.println("Slot vacated");
    }
}
