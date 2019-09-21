package io.github.kwahome.creational.factorymethod;

import java.util.Optional;

import io.github.kwahome.creational.factorymethod.example.car.Car;
import io.github.kwahome.creational.factorymethod.example.car.Coupe;
import io.github.kwahome.creational.factorymethod.example.car.HatchBack;
import io.github.kwahome.creational.factorymethod.example.car.Sedan;
import io.github.kwahome.creational.factorymethod.example.car.Van;
import io.github.kwahome.creational.factorymethod.example.car.enums.CarType;

public class CarFactory {
    public static Optional<Car> buildCar(final CarType carType) {
        Optional<Car> carOptional;
        switch (carType) {
            case COUPE:
                carOptional = Optional.of(new Coupe());
                break;
            case HATCHBACK:
                carOptional = Optional.of(new HatchBack());
                break;
            case SEDAN:
                carOptional = Optional.of(new Sedan());
                break;
            case VAN:
                carOptional = Optional.of(new Van());
                break;
            default:
                carOptional = Optional.empty();
        }
        return carOptional;
    }
}
