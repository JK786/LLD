package com.parking.services.CommandStrategy;

import com.parking.model.Car;
import com.parking.model.Command;
import com.parking.services.ParkingLotManagementService;
import lombok.AllArgsConstructor;

public class ParkCarCommandExecutor extends CommandExecutor {

    public ParkCarCommandExecutor(ParkingLotManagementService parkingLotManagementService) {
        super(parkingLotManagementService);
    }


    @Override
    public void execute(Command command) {

        final String registrationNumber = command.getArgs().get(0);
        final String color = command.getArgs().get(1);

        this.parkingLotManagementService.park(new Car(registrationNumber,color));
    }
}
