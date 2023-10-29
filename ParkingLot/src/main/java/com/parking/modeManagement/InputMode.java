package com.parking.modeManagement;


import com.parking.model.Command;
import com.parking.services.CommandStrategy.CommandExecutor;
import com.parking.services.CommandStrategy.CommandExecutorFactory;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class InputMode {

    private CommandExecutorFactory commandExecutorFactory;

    public void processCommand(final Command command) {
        CommandExecutor commandExecutor = this.commandExecutorFactory.getCommandExecutor(command);
        commandExecutor.execute(command);

        //TBD: Handle exception
    }

    public abstract void process();
}
