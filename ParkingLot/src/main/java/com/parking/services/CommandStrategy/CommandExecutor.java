package com.parking.services.CommandStrategy;

import com.parking.model.Command;
import com.parking.services.ParkingLotManagementService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * NOTE : This is a class and not an interface or we will have to pass the
 */
@AllArgsConstructor
@NoArgsConstructor
public abstract class CommandExecutor {

    ParkingLotManagementService parkingLotManagementService;


    public abstract void execute(Command command);
}
