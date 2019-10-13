package io.github.kwahome.behavioural.command.example.car.command;

import io.github.kwahome.behavioural.command.example.car.receiver.RotatingTop;

public class TopStopRotateCommand implements Command {

    private RotatingTop rotatingTop;

    public TopStopRotateCommand(final RotatingTop rotatingTop){
        this.rotatingTop = rotatingTop;
    }

    @Override
    public void execute() {
        System.out.println(this.getClass().getSimpleName() + ".execute(): Invoking RotatingTop.stopRotating()");
        this.rotatingTop.stopRotating();
    }

    @Override
    public void revoke() {
        System.out.println(this.getClass().getSimpleName() + ".revoke(): Revoking previous action -> Invoking "
                + "RotatingTop.startRotating()");
        this.rotatingTop.startRotating();
    }
}

