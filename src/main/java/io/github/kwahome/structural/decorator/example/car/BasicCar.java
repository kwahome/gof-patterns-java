package io.github.kwahome.structural.decorator.example.car;

public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Basic Car");
    }
}
