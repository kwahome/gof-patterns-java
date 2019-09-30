package io.github.kwahome.structural.decorator.example.car.decorator;

import io.github.kwahome.structural.decorator.example.car.Car;

public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of Luxury Car.");
    }
}
