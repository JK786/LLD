package com.parking;

import com.parking.modeManagement.CommandLineModeProcessor;
import com.parking.model.Command;
import com.parking.model.ParkingLot;
import com.parking.services.CommandStrategy.CommandExecutorFactory;
import com.parking.services.ParkingLotManagementService;

import java.util.Scanner;

/**
 * The program can be started in
 * file or CLI mode
 */
public class Main {

    public static void main(String args[]) {

        ParkingLotManagementService parkingLotManagementService = new ParkingLotManagementService();
        CommandExecutorFactory commandExecutorFactory = new CommandExecutorFactory(parkingLotManagementService);

        if(isCLIMode(args)) {
            new CommandLineModeProcessor(commandExecutorFactory).process();
        } else if(isFileMode(args)) {
            //TBD later
        } else {
            //TBD: Custom exception Invalid mode.
        }
    }

    private static Boolean isCLIMode(final String args[]) {
        return Boolean.TRUE;
    }

    private static Boolean isFileMode(final String args[]) {
        return Boolean.FALSE;
    }
}
