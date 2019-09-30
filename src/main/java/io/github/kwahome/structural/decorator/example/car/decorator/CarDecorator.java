package io.github.kwahome.structural.decorator.example.car.decorator;

import io.github.kwahome.structural.decorator.example.car.Car;

public abstract class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(final Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
