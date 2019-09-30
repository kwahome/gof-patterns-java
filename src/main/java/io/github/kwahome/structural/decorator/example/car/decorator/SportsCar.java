package io.github.kwahome.structural.decorator.example.car.decorator;

import io.github.kwahome.structural.decorator.example.car.Car;

public class SportsCar extends CarDecorator {

    public SportsCar(final Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of Sports Car.");
    }
}
