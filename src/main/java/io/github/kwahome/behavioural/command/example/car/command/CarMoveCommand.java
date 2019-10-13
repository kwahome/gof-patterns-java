package io.github.kwahome.behavioural.command.example.car.command;

import io.github.kwahome.behavioural.command.example.car.receiver.Car;

public class CarMoveCommand implements Command {

    private Car car;

    public CarMoveCommand(final Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        System.out.println(this.getClass().getSimpleName() + ".execute(): Invoking Car.move()");
        this.car.move();
    }

    @Override
    public void revoke() {
        System.out.println(this.getClass().getSimpleName() + ".revoke(): Revoking previous action -> Invoking Car"
                + ".stop()");
        this.car.stop();
    }
}
