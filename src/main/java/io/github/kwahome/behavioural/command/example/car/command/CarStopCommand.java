package io.github.kwahome.behavioural.command.example.car.command;

import io.github.kwahome.behavioural.command.example.car.receiver.Car;

public class CarStopCommand implements Command{

    private Car car;

    public CarStopCommand(final Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        System.out.println(this.getClass().getSimpleName() + ".execute(): Invoking Car.stop()");
        this.car.stop();
    }

    @Override
    public void revoke() {
        System.out.println(this.getClass().getSimpleName() + ".revoke(): Revoking previous action -> Invoking Car"
                + ".move()");
        this.car.move();
    }
}
