package com.parking.modeManagement;

import com.parking.model.Command;
import com.parking.services.CommandStrategy.CommandExecutorFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Setter
@Getter
public class CommandLineModeProcessor extends InputMode{

    public CommandLineModeProcessor(CommandExecutorFactory commandExecutorFactory) {
        super(commandExecutorFactory);
    }


    @Override
    public void process() {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()) {
            String input = scanner.nextLine();
            List<String> params = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            params.remove(input.split(" ")[0]);

            //TBD : We have to support multiple arguments to command , now only 1 in a list.
            Command command = new Command(input.split(" ")[0],params);

            this.processCommand(command);
        }
    }
}
