package io.github.kwahome.structural.decorator.example.car;

import io.github.kwahome.structural.decorator.example.car.decorator.LuxuryCar;
import io.github.kwahome.structural.decorator.example.car.decorator.SportsCar;

public class Application {
    public static void main(String []args) {

        System.out.println("Basic Car:");
        System.out.println("----------");
        basicCar();
        System.out.println("\n");

        System.out.println("Sports Car:");
        System.out.println("-----------");
        sportsCar();
        System.out.println("\n");

        System.out.println("Luxury Car:");
        System.out.println("-----------");
        luxuryCar();
        System.out.println("\n");

        System.out.println("Sports Luxury Car:");
        System.out.println("------------------");
        sportsLuxuryCar();
        System.out.println("\n");

        System.out.println("\n");
    }

    private static void basicCar() {
        Car car = new BasicCar();
        car.assemble();
    }

    private static void sportsCar() {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
    }

    private static void luxuryCar() {
        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();
    }

    private static void sportsLuxuryCar() {
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
