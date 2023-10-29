package com.parking.services.CommandStrategy;

import com.parking.model.Command;
import com.parking.services.ParkingLotManagementService;


import java.util.HashMap;
import java.util.Map;


public class CommandExecutorFactory {

    private Map<String,CommandExecutor> commandExecutorMap;

    public CommandExecutorFactory(ParkingLotManagementService parkingLotManagementService) {
        commandExecutorMap = new HashMap<>();
        commandExecutorMap.put("create_parking_lot",new CreateParkingLotCommandExecutor(parkingLotManagementService));
        commandExecutorMap.put("status", new StatusCommandExecutor(parkingLotManagementService));
        commandExecutorMap.put("park",new ParkCarCommandExecutor(parkingLotManagementService));
        commandExecutorMap.put("leave",new VacateSpotCommandExecutor(parkingLotManagementService));
    }


    public CommandExecutor getCommandExecutor(final Command command) {
        return this.commandExecutorMap.get(command.getCommandString());
    }

}
