package io.github.kwahome.behavioural.command.example.car.command;

import io.github.kwahome.behavioural.command.example.car.receiver.RotatingTop;

public class TopRotateCommand implements Command {

    private RotatingTop rotatingTop;

    public TopRotateCommand(final RotatingTop rotatingTop){
        this.rotatingTop = rotatingTop;
    }

    @Override
    public void execute() {
        System.out.println(this.getClass().getSimpleName() + ".execute(): Invoking RotatingTop.startRotating()");
        this.rotatingTop.startRotating();
    }

    @Override
    public void revoke() {
        System.out.println(this.getClass().getSimpleName() + ".revoke(): Revoking previous action -> Invoking "
                + "RotatingTop.stopRotating()");
        this.rotatingTop.stopRotating();
    }
}
