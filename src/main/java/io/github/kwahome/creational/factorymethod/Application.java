package io.github.kwahome.creational.factorymethod;

import java.util.ArrayList;

import io.github.kwahome.creational.factorymethod.example.car.Car;
import io.github.kwahome.creational.factorymethod.example.car.enums.CarType;

public class Application {
    public static void main(String []args) {
        System.out.println("Car Factory:");
        System.out.println("------------");

        ArrayList<CarType> carTypes = new ArrayList<>();
        carTypes.add(CarType.COUPE);
        carTypes.add(CarType.HATCHBACK);
        carTypes.add(CarType.SEDAN);
        carTypes.add(CarType.VAN);

        for (CarType carType: carTypes) {
            CarFactory.buildCar(carType).ifPresentOrElse(
                Car::assemble, () -> System.out.println("Car of provided type does not exist"));
        }

        System.out.println("\n");
    }
}
