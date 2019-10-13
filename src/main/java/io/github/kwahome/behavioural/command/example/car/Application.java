package io.github.kwahome.behavioural.command.example.car;

import io.github.kwahome.behavioural.command.example.car.command.CarMoveCommand;
import io.github.kwahome.behavioural.command.example.car.command.CarStopCommand;
import io.github.kwahome.behavioural.command.example.car.command.Command;
import io.github.kwahome.behavioural.command.example.car.invoker.RemoteControl;
import io.github.kwahome.behavioural.command.example.car.receiver.Car;

public class Application {
    public static void main(String []args) {

        System.out.println("Command Invocation:");
        System.out.println("-------------------");
        System.out.println("\n");

        RemoteControl remoteControl = new RemoteControl();
        moveCar(remoteControl);
        stopCar(remoteControl);

        System.out.println("\n");
    }

    private static void moveCar(final RemoteControl remoteControl) {
        System.out.println("...........");

        System.out.println("Testing onButtonPressed on RemoteControl for Ca\n");

        Car car = new Car();
        Command carMoveCommand = new CarMoveCommand(car);
        remoteControl.onButtonPressed(carMoveCommand);

        System.out.println("\n");

        System.out.println("Testing revokeButtonPressed on RemoteControl for Car\n");
        remoteControl.revokeButtonPressed();

        System.out.println("...........");
    }

    private static void stopCar(final RemoteControl remoteControl) {
        System.out.println("...........");
        System.out.println("Testing revokeButtonPressed on RemoteControl for Car\n");

        Car car = new Car();
        Command carStopCommand = new CarStopCommand(car);
        remoteControl.offButtonPressed(carStopCommand);

        System.out.println("\n");

        System.out.println("Testing revokeButtonPressed on RemoteControl for Car\n");
        remoteControl.revokeButtonPressed();
        System.out.println("...........");
    }
}
