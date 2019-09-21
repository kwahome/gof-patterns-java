package io.github.kwahome.creational.factorymethod.example.car;

import io.github.kwahome.creational.factorymethod.example.car.enums.CarType;

public class Coupe implements Car {
    @Override
    public String getType() {
        return CarType.COUPE.name();
    }

    @Override
    public void assemble() {
        System.out.println("Assembling " + this.getType());
    }
}
