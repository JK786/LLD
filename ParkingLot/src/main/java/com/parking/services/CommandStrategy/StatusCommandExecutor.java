package com.parking.services.CommandStrategy;


import com.parking.model.Command;
import com.parking.services.ParkingLotManagementService;
import com.parking.services.ParkingStrategy.ClosestToEntranceParkingStrategy;


public class StatusCommandExecutor extends  CommandExecutor {

    public StatusCommandExecutor(ParkingLotManagementService parkingLotManagementService) {
        super(parkingLotManagementService);
    }

    @Override
    public void execute(Command command) {

        final Integer capacity = Integer.parseInt(command.getArgs().get(0));
        this.parkingLotManagementService.createParkingLot(capacity,new ClosestToEntranceParkingStrategy());

    }
}
