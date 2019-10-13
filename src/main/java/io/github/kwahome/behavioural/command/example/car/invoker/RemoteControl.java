package io.github.kwahome.behavioural.command.example.car.invoker;

import io.github.kwahome.behavioural.command.example.car.command.Command;

public class RemoteControl {
    private Command onCommand;
    private Command offCommand;
    private Command revokeCommand;

    public void onButtonPressed(final Command onCommand) {
        this.onCommand = onCommand;
        this.onCommand.execute();
        this.revokeCommand = onCommand;
    }
    public void offButtonPressed(final Command offCommand) {
        this.offCommand = offCommand;
        this.offCommand.execute();
        this.revokeCommand = offCommand;
    }
    public void revokeButtonPressed() {
        this.revokeCommand.revoke();
    }

}
